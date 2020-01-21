package com.cc.leetcode;

import com.cc.common.base.Node;

import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个 N 叉树，返回其节点值的前序遍历。
 *
 * @author cuilongcan
 * @create 2019-12-19
 */
public class NAryTreePreorderTraversal {

    public List<Integer> preorder(Node root) {
        List<Integer> list = new LinkedList<>();
        if (root == null) {
            return list;
        }

            list.add(root.val);
        if (root.children!=null) {
            for (Node child : root.children) {
                list.addAll(preorder(child));
            }
        }
        return list;
    }
}
