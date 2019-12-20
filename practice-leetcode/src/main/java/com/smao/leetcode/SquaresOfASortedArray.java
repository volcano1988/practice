package com.smao.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 *
 * 示例 1：
 *
 * 输入：[-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 * 示例 2：
 *
 * 输入：[-7,-3,2,3,11]
 * 输出：[4,9,9,49,121]
 *  
 * 提示：
 *
 * 1 <= A.length <= 10000
 * -10000 <= A[i] <= 10000
 * A 已按非递减顺序排序。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/squares-of-a-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SquaresOfASortedArray {
    public static int[] sortedSquares(int[] A) {
        if(A==null || A.length==0){
            return A;
        }
        int[] sort = new int[A.length];
        Stack<Integer> negativeNumber = new Stack();
        int k = 0;
        for(int i=0;i<A.length;i++){
            if(A[i]<0){
                negativeNumber.push(A[i]);
            }else{
                while(negativeNumber.size()>0){
                    if(Math.pow(negativeNumber.peek(),2)<Math.pow(A[i],2)){
                        sort[k] =  (int)Math.pow(negativeNumber.pop(),2);
                        k++;
                    }else{
                        break;
                    }
                }
                sort[k] =  (int)Math.pow(A[i],2);
                k++;
            }
        }
        while(negativeNumber.size()>0){
            sort[k++] =  (int)Math.pow(negativeNumber.pop(),2);
        }
        return sort;
    }
    public static int[] sortedSquares2(int[] A) {
        if(A==null || A.length==0){
            return A;
        }
        int[] sort = new int[A.length];
        for(int i=0;i<A.length;i++){
           sort[i] =  (int)Math.pow(A[i],2);
        }
        Arrays.sort(sort);
        return sort;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-1})));
    }
}
