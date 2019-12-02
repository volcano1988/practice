package com.cc.leetcode;

/**
 * @author cuilongcan
 * @create 2019/3/14
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] two = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target - nums[i] == nums[j]) {
                    two[0] = i;
                    two[1] = j;
                    return two;
                }
            }
        }
        return two;
    }
}
