package com.smao.leetcode;

import java.util.Arrays;

/**
 * 给定长度为 2n 的数组, 你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。
 *
 * 示例 1:
 *
 * 输入: [1,4,3,2]
 *
 * 输出: 4
 * 解释: n 等于 2, 最大总和为 4 = min(1, 2) + min(3, 4).
 * 提示:
 *
 * n 是正整数,范围在 [1, 10000].
 * 数组中的元素范围在 [-10000, 10000].
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/array-partition-i
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ArrayPartitionI {
    public static int arrayPairSum(int[] nums) {
        int num = 0;
        nums = insertionSort(nums);
//        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2){
            num = num+nums[i];
        }
        return num;
    }
    public static void main(String[] args) {
        System.out.print(arrayPairSum(new int[]{7,3,1,0,0,6}));
    }
    //冒泡排序
    public static int[] bubbleSort(int[] array){
        for(int i=0;i<array.length;i++){
            boolean flag = false;
            for(int j=0;j<array.length-i-1;j++){
                if(array[j+1]<array[j]){
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
        return array;
    }
    //插入排序
    public static int[] insertionSort(int[] array){
        for(int i=1;i<array.length;i++){
            int temp = array[i];
            int j=i-1;
            for(;j>=0;j--){
                if(array[j]>temp){
                    array[j+1] = array[j];
                }else{
                    break;
                }
            }
            array[j+1] = temp;
        }
        return array;
    }

    public static int[] selectionSort(int[] array){
        for(int i=0;i<array.length;i++){
            int minIndex = i;
            for(int j=i+1;j<array.length;j++){
                if(array[minIndex]>array[j]){
                    minIndex = j;
                }
            }
            int t = array[i];
            array[i] = array[minIndex];
            array[minIndex] = t;
        }
        return array;
    }
}
