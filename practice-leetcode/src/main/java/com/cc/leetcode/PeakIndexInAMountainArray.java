package com.cc.leetcode;

import java.util.Arrays;

/**
 * 我们把符合下列属性的数组 A 称作山脉：
 *
 * A.length >= 3
 * 存在 0 < i < A.length - 1 使得A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
 * 给定一个确定为山脉的数组，返回任何满足 A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] 的 i 的值。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/peak-index-in-a-mountain-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author cuilongcan <cui.longcan@chinaott.net>
 * @create 2019-12-26
 */
public class PeakIndexInAMountainArray {

    public int peakIndexInMountainArray(int[] A) {
        int i = 0;
        int temp = 0;
        for (int j = 0; j < A.length; j++) {
            if (A[j]>=temp){
                temp = A[j];
                i=j;
            }
        }


        return i;
    }
}
