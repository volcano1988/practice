package com.cc.leetcode;

import com.cc.common.base.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个 N 叉树，返回其节点值的后序遍历。
 *
 * @author cuilongcan <cui.longcan@chinaott.net>
 * @create 2019-12-16
 */
public class NAryTreePostorderTraversal {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root != null) {
            if (root.children != null && root.children.size() > 0) {
                for (Node child : root.children) {
                    list.addAll(postorder(child));
                }
            }
            list.add(root.val);
        }
        return list;
    }

}
