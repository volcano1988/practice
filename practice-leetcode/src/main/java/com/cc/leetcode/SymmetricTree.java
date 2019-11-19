package com.cc.leetcode;


import base.TreeNode;

/**
 * @author cuilongcan <cui.longcan@chinaott.net>
 * @create 2019/3/13
 */
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if (root != null) {
            if (root.left != null
                    && root.right != null
                    && root.left.val == root.right.val) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        new SymmetricTree().isSymmetric(node);
    }
}
