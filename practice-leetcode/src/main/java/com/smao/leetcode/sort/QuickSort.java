package com.smao.leetcode.sort;

import java.util.Arrays;

/**
 * 快速排序
 */
public class QuickSort {
    public static int[] quickSort(int[] array){
        int p = 0;
        int r = array.length-1;
        quickSortC(array,p,r);
        return array;
    }

    private static void quickSortC(int[] array, int p, int r) {
        if(p>=r){
            return;
        }
        int q = partition(p,r,array);
        quickSortC(array,p,q-1);
        quickSortC(array,q+1,r);
    }

    private static int partition(int p, int r, int[] array) {
        int i = p;
        int j = p;
        for(;j<=r-1;j++){
            if(array[j]<array[r]){
                int t = array[i];
                array[i] = array[j];
                array[j] = t;
                i++;
            }
        }
        int t = array[i];
        array[i] = array[r];
        array[r] = t;
        return i;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(quickSort(new int[]{8,10,2,3,6,1,5})));
    }
}
