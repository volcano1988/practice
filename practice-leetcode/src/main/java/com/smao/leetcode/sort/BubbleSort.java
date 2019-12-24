package com.smao.leetcode.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public static int[] bubbleSort(int[] array) {
        for(int i=0;i<array.length;i++){
            boolean flag = false;
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[]{6,5,4,3,2,1})));
    }
}
