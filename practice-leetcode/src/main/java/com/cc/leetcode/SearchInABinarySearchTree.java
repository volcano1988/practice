package com.cc.leetcode;

import com.cc.common.base.TreeNode;

/**
 * 给定二叉搜索树（BST）的根节点和一个值。
 * 你需要在BST中找到节点值等于给定值的节点。 返回以该节点为根的子树。 如果节点不存在，则返回 NULL。
 *
 * @author cuilongcan <cui.longcan@chinaott.net>
 * @create 2019-12-18
 */
public class SearchInABinarySearchTree {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root==null){
            return null;
        }
        if (root.val==val){
            return root;
        }
        TreeNode leftNode = searchBST(root.left, val);
        TreeNode rightNode = searchBST(root.right, val);
        return leftNode!=null?leftNode:rightNode;
    }
}
