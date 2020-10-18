package com.smao.leetcode;

import com.practice.common.base.TreeNode;

/**
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 *
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 *
 * 示例:
 *
 * 给定有序数组: [-10,-3,0,5,9],
 *
 * 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
 *
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ConvertSortedArrayToBinarySearchTree {
    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }
        TreeNode root = new TreeNode(nums[nums.length / 2]);
        int[] numsLeft = new int[nums.length / 2];
        int[] numsRight = new int[nums.length - nums.length / 2 - 1];
        for (int i = 0; i < nums.length / 2; i++) {
            numsLeft[i] = nums[i];
        }
        for (int i = nums.length / 2 + 1; i < nums.length; i++) {
            numsRight[i - (nums.length / 2 + 1)] = nums[i];
        }
        root.left = sortedArrayToBST(numsLeft);
        root.right = sortedArrayToBST(numsRight);
        return root;
    }

    public static TreeNode sortedArrayToBST1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        TreeNode treeNode = twoPoints(0, nums.length-1, nums);
        return treeNode;
    }

    public static TreeNode twoPoints(int start, int end, int[] nums) {
        if (start > end) {
            return null;
        }
        int mid = (end - start) / 2 + start;
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = twoPoints(start, mid - 1, nums);
        treeNode.right = twoPoints(mid + 1, end, nums);
        return treeNode;
    }

    public static void main(String[] args) {
        System.out.println(sortedArrayToBST1(new int[]{-10, -3, 0, 5, 9}));
    }
}
