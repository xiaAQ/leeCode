package com.xiahl.leecode.plan20;

/**
 * @author xiahl
 * @date 2022/2/8 10:18
 * @Desc: 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 请必须使用时间复杂度为 O(log n) 的算法
 */
public class Day01_搜索插入位置 {
    public static void main(String[] args) {
        int nums[] = new int[]{1, 2, 3, 8, 9};
        int target = 1;
        int search = searchInsert(nums, target);
        System.out.println(search);

    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid;
                if (mid==0){
                    return 0;
                }
                if (nums[mid-1]<target){
                    return mid;
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        return left;
    }
}
