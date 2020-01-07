package com.smao.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * 示例 1:
 *
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2]
 * 示例 2:
 *
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [9,4]
 * 说明:
 *
 * 输出结果中的每个元素一定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/intersection-of-two-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }
        set1.retainAll(set2);
        int[] nums3 = new int[set1.size()];
        int i = 0;
        for(Integer num:set1){
            nums3[i] = num;
            i++;
        }
        return nums3;
    }
    public static int[] intersection1(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }
        if(set1.size()<set2.size()){
            return set_intersection(set1,set2);
        }else{
            return set_intersection(set2,set1);
        }
    }
    public static int[] set_intersection(Set<Integer> set1,Set<Integer> set2){
        int[] nums3 = new int[set1.size()];
        int i = 0;
        for(Integer num:set1){
            if(set2.contains(num)){
                nums3[i++] = num;
            }
        }
        return Arrays.copyOf(nums3,i);
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{4,1,9,5},new int[]{9,4,9,8,4})));
    }
}
