package com.smao.leetcode.sort;

import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectionSort {
    public static int[] selectionSort(int[] array){
        for(int i=0;i<array.length;i++){
            int minCode = i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[minCode]){
                    minCode = j;
                }
            }
            int temp =array[i];
            array[i] = array[minCode];
            array[minCode] = temp;
        }
        return array;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(selectionSort(new int[]{4,5,6,3,2,1})));
    }
}
