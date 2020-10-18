package com.cc.leetcode;

import com.practice.common.base.TreeNode;

/**
 * 给定二叉搜索树的根结点 root，返回 L 和 R（含）之间的所有结点的值的和。
 * <p>
 * 二叉搜索树保证具有唯一的值
 *
 * @author cuilongcan
 * @create 2019-11-29
 */
public class RangeSumOfBST {

    public int rangeSumBST(TreeNode root, int L, int R) {
        int x = 0;
        if (root.val >= L && root.val <= R) {
            x += root.val;
        }
        if (root.left != null) {
            x += rangeSumBST(root.left, L, R);
        }
        if (root.right != null) {
            x += rangeSumBST(root.right, L, R);
        }
        return x;
    }
}
