package com.smao.leetcode.sort;

import java.util.Arrays;

/**
 * 归并排序
 */
public class MergeSort {
    public static int[] mergeSort(int[] nums){
        int start = 0;
        int end = nums.length-1;
        mergeSortC(start,end,nums);
        return nums;
    }
    public static void mergeSortC(int start,int end,int[] nums){
        if(start>=end){
            return;
        }
        int mid = (start+end)/2;
        mergeSortC(start,mid,nums);
        mergeSortC(mid+1,end,nums);
        merge(start,mid,end,nums);
    }
    public static void merge(int start,int mid,int end,int[] nums){
        int i = start;
        int j = mid+1;
        int k = 0;
        int[] temp = new int[nums.length];
        while(i<=mid && j<=end){
            if(nums[i]<nums[j]){
                temp[k] = nums[i];
                i++;
                k++;
            }else{
                temp[k] = nums[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            temp[k++] = nums[i];
            i++;
        }
        while(j<=end){
            temp[k++] = nums[j];
            j++;
        }
        for(int l = 0;l<=end-start;l++){
            nums[l+start] = temp[l];
        }
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeSort(new int[]{11,8,3,9,7,1,2,5})));
    }
}
