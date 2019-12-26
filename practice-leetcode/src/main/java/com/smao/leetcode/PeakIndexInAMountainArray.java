package com.smao.leetcode;

/**
 * 我们把符合下列属性的数组 A 称作山脉：
 *
 * A.length >= 3
 * 存在 0 < i < A.length - 1 使得A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
 * 给定一个确定为山脉的数组，返回任何满足 A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] 的 i 的值。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[0,1,0]
 * 输出：1
 * 示例 2：
 *
 * 输入：[0,2,1,0]
 * 输出：1
 *  
 *
 * 提示：
 *
 * 3 <= A.length <= 10000
 * 0 <= A[i] <= 10^6
 * A 是如上定义的山脉
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/peak-index-in-a-mountain-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class PeakIndexInAMountainArray {
    //普通
    public static int peakIndexInMountainArray(int[] A) {
        for(int i=0;i<A.length;i++){
            if(A[i+1]<A[i]){
                return i;
            }
        }
        return 0;
    }

    //二分查找
    public static int peakIndexInMountainArray1(int[] A) {
        int lo = 0 ;
        int hi = A.length-1;
        while(lo<hi){
            int mid = lo+(hi-lo)/2;
            if(A[mid]<A[mid+1]){
                lo = mid+1;
            }else{
                hi = mid;
            }
        }
        return lo;
    }
    public static void main(String[] args) {
        System.out.print(peakIndexInMountainArray(new int[]{0,2,1,0}));
    }
}
