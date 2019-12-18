package com.smao.leetcode;

import com.cc.common.base.Node;
import com.cc.common.base.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 给定一个 N 叉树，返回其节点值的后序遍历。
 *
 * 说明: 递归法很简单，你可以使用迭代法完成此题吗?
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class NAryTreePostorderTraversal {
    /**
     * 递归
     * @param root
     * @return
     */
    public static List<Integer> list = new ArrayList<>();
    public static List<Integer> postorder(Node root) {
        if(root == null){
            return list;
        }
        if(root.children!=null){
            for(int i=0;i<root.children.size();i++){
                postorder(root.children.get(i));
            }
        }
        list.add(root.val);
        return list;
    }
    /**
     * 迭代
     * @param root
     * @return
     */
    public static List<Integer> postorder2(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null) {
            return output;
        }

        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            output.addFirst(node.val);
            if(node.children!=null){
                for (Node item : node.children) {
                    if (item != null) {
                        stack.add(item);
                    }
                }
            }
        }
        return output;
    }
    public static void main(String[] args) {
        Node child121 = new Node(5);
        Node child122 = new Node(6);
        List<Node> child2 = new ArrayList<>();
        child2.add(child121);
        child2.add(child122);

        Node child11 = new Node(3,child2);
        Node child12 = new Node(2);
        Node child13 = new Node(4);
        List<Node> child1 = new ArrayList<>();
        child1.add(child11);
        child1.add(child12);
        child1.add(child13);
        Node root = new Node(1,child1);
        postorder2(root);
    }
}
