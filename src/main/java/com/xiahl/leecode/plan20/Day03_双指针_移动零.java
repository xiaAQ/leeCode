package com.xiahl.leecode.plan20;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author xiahl
 * @date 2022/2/10 10:51
 * @Desc: 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 * nums = 1 , 2, 0 , 3 ,4 ,5
 */
public class Day03_双指针_移动零 {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int left = 0;
        //数组长度
        int length = nums.length;

        //新构建的数组
        int[] newArr = new int[length];
        int write = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) {
                newArr[write] = nums[i];
                write++;
            }
        }
        for (int j = write; j < length; j++) {
            newArr[j] = 0;
        }
        Arrays.stream(newArr).forEach(System.out::println);
    }
    /**
     * int start = 0;
     *         for (int i = 0; i < nums.length; i++) {
     *             if(nums[i] != 0){
     *                 nums[start++] = nums[i]; // 双指针解法，将非0的数移到前面
     *             }
     *         }
     *         for (int i = start; i < nums.length; i++) {
     *             nums[i] = 0; // 然后将后面的数取0
     *         }
     *
     * 作者：lucky845
     * 链接：https://leetcode-cn.com/problems/move-zeroes/solution/yi-dong-ling-by-lucky845-eywl/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
}
