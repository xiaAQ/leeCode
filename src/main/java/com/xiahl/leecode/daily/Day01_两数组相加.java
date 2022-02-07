package com.xiahl.leecode.daily;

/**
 * @author xiahl
 * @version 1.0
 * @date 2021/4/29 14:14
 * @Desc:两数相加: 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 */
public class Day01_两数组相加 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] twoNumSum = getTwoNumSum(arr, 5);
        int length = twoNumSum.length;
        for (int i = 0; i < length; i++) {
            System.out.println(twoNumSum[i]);
        }
    }

    /**
     * 解题思路一  很笨   相加,然后过滤掉相同的key的情况.
     *
     * @param arrs
     * @param target
     * @return
     */
    public static int[] getTwoNumSum(int[] arrs, int target) {
        int[] ints = new int[2];
        for (int a = 0; a < arrs.length; a++) {
            for (int b = 0; b < arrs.length; b++) {
                if (arrs[a] + arrs[b] == target) {
                    if (a == b) {
                        continue;
                    } else {
                        ints[0] = a;
                        ints[1] = b;
                    }

                }
            }
        }
        return ints;
    }

    /**
     * 解题思路二:
     *
     * @param arrs
     * @param target
     * @return
     */
    public static int[] getTwoNumSum2(int[] arrs, int target) {
        return null;
    }

}
