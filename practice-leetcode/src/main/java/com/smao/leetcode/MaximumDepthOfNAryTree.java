package com.smao.leetcode;

import com.cc.common.base.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 给定一个 N 叉树，找到其最大深度。
 *
 * 最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。
 *
 * 例如，给定一个 3叉树 :
 *
 *         1
 *    /    |	\
 *   3     2	4
 *  / \
 * 5   6
 *
 * 我们应返回其最大深度，3。
 *
 * 说明:
 *
 * 树的深度不会超过 1000。
 * 树的节点总不会超过 5000。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-depth-of-n-ary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MaximumDepthOfNAryTree {
    public static int maxDepth(Node root) {
        if(root==null){
            return 0;
        }
        List<Node> children = root.children;
        int pre = 1;
        for(int i=0;(children!=null&&i<children.size());i++){
            int max = 1;
            max += maxDepth(children.get(i));
            pre = max>pre?max:pre;
        }
        return pre;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        List<Node> childers1 = new ArrayList<>();
        Node node11 = new Node(3);
        List<Node> childers21 = new ArrayList<>();
        childers21.add(new Node(5));
        childers21.add(new Node(6));
        node11.children = childers21;
        Node node12 = new Node(2);
        Node node13 = new Node(4);
        childers1.add(node11);
        childers1.add(node12);
        childers1.add(node13);
        root.children = childers1;
        System.out.println(maxDepth(root));
    }
}
