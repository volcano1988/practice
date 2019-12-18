package com.smao.leetcode;

import com.cc.common.base.TreeNode;

/**
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回它的最大深度 3 。
 *
 * 链接：https://leetcode-cn.com/problems/maximum-depth-of-binary-tree
 */
public class MaximumDepthOfBinaryTree {
    public static int maxDepth(TreeNode root,int num) {
        if(root==null){
            return num;
        }
        num++;
        int left = maxDepth(root.left,num);
        int right = maxDepth(root.right,num);
        return left>right?left:right;
    }
    public static int maxDepth2(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = maxDepth2(root.left);
        int right = maxDepth2(root.right);
        return left>right?left+1:right+1;
    }
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.right = new TreeNode(7);
        treeNode.right.right.right = new TreeNode(7);
        treeNode.right.right.right.right = new TreeNode(7);
        System.out.print(maxDepth2(treeNode));
    }

}
