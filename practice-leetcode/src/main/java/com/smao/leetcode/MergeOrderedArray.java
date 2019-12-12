package com.smao.leetcode;

import java.util.Arrays;

/**
 * 实现两个有序数组合并为一个有序数组
 */
public class MergeOrderedArray {
    public static void main(String[] args) {
        int[] one = new int[]{2, 5, 7, 10, 12, 13, 19};
        int[] two = new int[]{2, 6, 8, 9, 10, 11};
        int[] result = new int[one.length + two.length];
        int index = 0;
        int i = 0;
        int j = 0;
        int min = one.length;
        int max = two.length;
        while (i < min && j < max) {
            if (one[i] < two[j]) {
                result[index] = one[i];
                index++;
                i++;
            } else {
                result[index] = two[j];
                j++;
                index++;
            }
        }
        if (i<min) {
            System.arraycopy(one,i,result,index,one.length-i);
        }
        if (j<max) {
            System.arraycopy(two,j,result,index,two.length-j);
        }
        System.out.print(Arrays.toString(result));
    }
}
