package com.cc.leetcode;

import java.util.Arrays;

/**
 * 在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。
 *
 * 返回重复了 N 次的那个元素。
 *
 * 提示：
 *
 * 4 <= A.length <= 10000
 * 0 <= A[i] < 10000
 * A.length 为偶数
 *
 * @create 2020-01-16
 */
public class NRepeatedElementinSize2NArray {
    public int repeatedNTimes(int[] A) {
        Arrays.sort(A);
        int temp = -1;
        for (int i : A) {
            if (temp == -1) {
                temp = i;
                continue;
            }
            if (temp == i) {
                return temp;
            }else{
                temp =i;
            }

        }
        return temp;
    }

    public static void main(String[] args) {
        new NRepeatedElementinSize2NArray().repeatedNTimes(
                new int[]{1, 2, 3, 3});
    }
}
