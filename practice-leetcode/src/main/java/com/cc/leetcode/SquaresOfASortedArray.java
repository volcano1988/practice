package com.cc.leetcode;

import java.util.Arrays;

/**
 * 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 *
 * 示例 1：
 *
 * 输入：[-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 *
 * @author cuilongcan
 * @create 2019-12-17
 */
public class SquaresOfASortedArray {

    public int[] sortedSquares(int[] A) {
        int[] B = new int [A.length];
        for (int i = 0; i < A.length; i++) {
            B[i]=A[i]*A[i];
        }
        Arrays.sort(B);

        return B;
    }

}
