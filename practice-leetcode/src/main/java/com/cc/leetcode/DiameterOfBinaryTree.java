package com.cc.leetcode;


import com.cc.common.base.TreeNode;

/**
 * @author cuilongcan <cui.longcan@chinaott.onaliyun.net>
 * @create 2019/3/7
 */
public class DiameterOfBinaryTree {
    static int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {

        if (root != null) {
            int i = diameterOfBinaryTree(root.right);
            if (i > max) {
                max = i;
            } else {
                int j = diameterOfBinaryTree(root.left);
                if (j > max) {
                    max = j;
                } else {
                    return root.val;
                }
            }
        }
        return max;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        System.out.println(new DiameterOfBinaryTree().diameterOfBinaryTree(root));
    }
}
