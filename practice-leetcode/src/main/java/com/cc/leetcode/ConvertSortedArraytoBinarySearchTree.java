package com.cc.leetcode;

import com.cc.common.base.TreeNode;

import java.util.Arrays;

/**
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 *
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 *
 * @author cuilongcan
 * @create 2020-01-16
 */
//todo
public class ConvertSortedArraytoBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return null;
        }
        int len = nums.length;
        int mid = len / 2;
        int midVal = nums[mid];
        TreeNode root = new TreeNode(midVal);
        if (mid > 0) {//说明还有左子树
            root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid));
        }
        if (mid < len - 1) {//说明还有右子树
            root.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid + 1, len));
        }
        return root;

    }

}
