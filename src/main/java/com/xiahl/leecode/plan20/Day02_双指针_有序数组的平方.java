package com.xiahl.leecode.plan20;

import java.util.Arrays;

/**
 * @author xiahl
 * @date 2022/2/8 17:44
 * @Desc:给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 * 请你设计时间复杂度为 O(n) 的算法解决本问题
 * 输入：nums = [-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 * 解释：平方后，数组变为 [16,1,0,9,100]
 * 排序后，数组变为 [0,1,9,16,100]
 */
public class Day02_双指针_有序数组的平方 {

    public static void main(String[] args) {
        int[] num  ={-5,-1,1,18};
        int[] ints = sortedSquares(num);
        Arrays.stream(ints).forEach(System.out::println);
    }

    public static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        //存入平方数据
        int[] result = new int[nums.length];
        //定义开始写的下标
        int write = nums.length - 1;
        //循环遍历然后存入到数组中
        while (left <= right) {
            if (nums[left] * nums[left] < nums[right] * nums[right]) {
                result[write] = nums[right] * nums[right];
                right--;
                write--;
            } else {
                result[write] = nums[left] * nums[left];
                left++;
                write--;
            }
        }

        return result;
    }

}
