package com.smao.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
 *
 * 你可以返回满足此条件的任何数组作为答案。
 *
 *  
 *
 * 示例：
 *
 * 输入：[3,1,2,4]
 * 输出：[2,4,3,1]
 * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
 *  
 *
 * 提示：
 *
 * 1 <= A.length <= 5000
 * 0 <= A[i] <= 5000
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-array-by-parity
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] A) {
        int index = 0;
        for(int i=0;i<A.length;i++){
            if (A[i] % 2 == 0) {
                int t = A[i];
                A[i] = A[index];
                A[index] = t;
                index++;
            }
        }
        return A;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{3,1,2,4})));
    }

}
