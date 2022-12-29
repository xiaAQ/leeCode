package com.xiahl.leecode.daily;


import java.util.HashMap;
import java.util.Map;

/**
 * @author xiahl
 * @version 1.0
 * @date 2021/4/30 15:18
 * 题目:  给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。看解析了.
 */
public class Day04_最长字符串 {

    public static void main(String[] args) {
        int length = lengthOfLongestSubstring("abcabcbb");
        System.out.println(length);
    }

    public static int lengthOfLongestSubstring(String s) {
        int fs = 0;//用于存取最后要返回的长度
        //1.创建一个map，key：字符，value: 字符下标  `
        Map<Character, Integer> map = new HashMap<>();
        //2.遍历字符串，并将字符串存入map中
        for (int start = 0, end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            if (map.containsKey(ch)) { //若已经存在于map中，则将其对应的value拿出来
                start = Math.max(map.get(ch), start);
            }
            // 取较大值
            fs = Math.max(fs, end - start + 1);
            //存入map中
            map.put(ch, end + 1);
        }
        return fs;
    }

    //窗口函数第二版
    public static int lengthOfLongestSubstring2(String s) {
        //窗口函数开始
        int start =  0;
        //窗口 函数后开始
        int end = 0;
        //计算num的值为最大值的长度
        int num = 0;

        return 0;
    }
}
