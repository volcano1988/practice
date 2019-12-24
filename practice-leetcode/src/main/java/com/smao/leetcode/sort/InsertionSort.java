package com.smao.leetcode.sort;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertionSort {
    public static int[] insertionSort(int[] array){
        for(int i=1;i<array.length;i++){
            int temp = array[i];
            int j=i-1;
            for(;j>0;j--){
                if(temp>array[j]){
                    array[j+1] = array[j];
                }else{
                    break;
                }
            }
            array[j+1] = temp;
        }
        return array;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(insertionSort(new int[]{6,5,4,3,2,1})));
    }
}
