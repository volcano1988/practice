package com.cc.leetcode;

import com.cc.common.base.TreeNode;

/**
 * @author cuilongcan
 * @create 2019-12-12
 */

//todo
public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        return maxThis(root, 0);
    }

    private int maxThis(TreeNode root, int dep) {
        if (root == null) {
            return dep;
        }
        int left = dep;
        int right = dep;
        if (root.left != null) {
            left += left + 1;
            left = maxThis(root.left, left);
        }
        if (root.right != null) {
            right += right + 1;
            right = maxThis(root.right, right);
        }
        if (root.left == null && root.right == null) {
            return dep;
        }
        return left > right ? left : right;
    }
}
