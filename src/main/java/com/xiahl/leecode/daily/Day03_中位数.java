package com.xiahl.leecode.daily;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author xiahl
 * @version 1.0
 * @date 2021/5/6 17:33
 * @Desc:给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数
 */
public class Day03_中位数 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3};
        double doubletest = findMedianSortedArrays(nums1, nums2);
        System.out.println(doubletest);

    }

    /**
     * 1.我能想到的 先排序 再求中位数  考虑边界问题   效率不行
     * @param nums1
     * @param nums2
     * @return
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //1.先排序
        int length1 = nums1.length;
        int length2 = nums2.length;
        int[] arrays= new int[length1+length2];
        System.arraycopy(nums1, 0, arrays, 0, nums1.length);  //包左不包右
        System.arraycopy(nums2, 0, arrays, nums1.length, nums2.length);
        Arrays.sort(arrays);
        Arrays.stream(arrays).forEach(e-> System.out.println(e));
        //2.求中位数

        //3,考虑便捷性的问题
       return 0.0;
    }
}
