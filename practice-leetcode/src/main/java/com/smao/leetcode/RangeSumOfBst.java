package com.smao.leetcode;

import com.cc.common.base.TreeNode;

/**
 * 938. 二叉搜索树的范围和
 *
 * 给定二叉搜索树的根结点 root，返回 L 和 R（含）之间的所有结点的值的和。
 * 二叉搜索树保证具有唯一的值。
 *
 * 示例 1：
 *
 *      输入：root = [10,5,15,3,7,null,18], L = 7, R = 15
 *      输出：32
 * 示例 2：
 *
 *      输入：root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
 *      输出：23
 *
 * 提示：
 *
 *      树中的结点数量最多为 10000 个。
 *      最终的答案保证小于 2^31。
 *
 * 链接：https://leetcode-cn.com/problems/range-sum-of-bst
 */
public class RangeSumOfBst {
    public static int num = 0;
    public static int rangeSumBST(TreeNode root, int L, int R) {
        if(root==null){
            return 0;
        }
        if(root.val>=L&&root.val<=R){
            num = num+root.val;
        }
        rangeSumBST(root.left,L,R);
        rangeSumBST(root.right,L,R);
        return num;
    }
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(5);
        treeNode.right = new TreeNode(15);
        treeNode.left.left = new TreeNode(3);
        treeNode.left.right = new TreeNode(7);
        treeNode.right.left = new TreeNode(13);
        treeNode.right.right = new TreeNode(18);
        treeNode.left.left.left = new TreeNode(1);
        treeNode.left.left.left = new TreeNode(6);
        System.out.print(rangeSumBST(treeNode,6,10));
    }
}
