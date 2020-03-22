package com.smao.leetcode;

import java.util.Arrays;

/**
 * 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
 *
 * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
 *
 * 你可以返回任何满足上述条件的数组作为答案。
 *
 * 示例：
 *
 * 输入：[4,2,5,7]
 * 输出：[4,5,2,7]
 * 解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
 *  
 * 提示：
 *
 * 2 <= A.length <= 20000
 * A.length % 2 == 0
 * 0 <= A[i] <= 1000
 *  
 * 在真实的面试中遇到过这道题？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-array-by-parity-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SortArrayByParityII {
    public static int[] sortArrayByParityII(int[] A) {
        int[] even = new int[A.length/2];
        int[] odd = new int[A.length/2];
        int e = 0;
        int o = 0;
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){
                even[e] = A[i];
                e++;
            }else{
                odd[o] = A[i];
                o++;
            }
        }
        int[] b = new int[A.length];
        for(int i=0;i<A.length&&e>0;i+=2){
            b[i] = even[--e];
            b[i+1] = odd[--o];
        }
        return b;
    }
    public static int[] sortArrayByParityII1(int[] A) {
        int e = 0;
        int o = 1;
        int[] b = new int[A.length];
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){
                b[e] = A[i];
                e+=2;
            }
        }
        for(int i=0;i<A.length;i++){
            if(A[i]%2!=0){
                b[o] = A[i];
                o+=2;
            }
        }
        return b;
    }
    //找到一个偶数位是奇数的前提下,找奇数位上的偶数,找到之后在交换.
    public static int[] sortArrayByParityII3(int[] A) {
        int j = 1;
        for (int i = 0; i < A.length; i += 2)
            if (A[i] % 2 == 1) {
                while (A[j] % 2 == 1)
                    j += 2;

                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }

        return A;

    }

    public static void main(String[] args) {
        Double du = null;
        Double d = 0.00;
        System.out.print(d>du);
    }

}
