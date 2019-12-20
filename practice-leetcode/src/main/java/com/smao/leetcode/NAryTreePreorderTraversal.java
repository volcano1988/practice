package com.smao.leetcode;

import com.cc.common.base.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NAryTreePreorderTraversal {
    public List<Integer> preorder(Node root) {
        List<Integer> integers = new ArrayList<Integer>();
        if(root==null){
            return integers;
        }
        LinkedList<Node> nodes = new LinkedList<Node>();
        nodes.add(root);
        while(nodes!=null && nodes.size()!=0){
            Node children = nodes.pollFirst();
            LinkedList<Node> temp = new LinkedList<Node>();
            if(children.children!=null){
                for(Node node:children.children){
                    temp.add(node);
                }
                if(nodes!=null && nodes.size()!=0){
                    temp.addAll(nodes);
                }
                nodes = temp;
            }
            integers.add(children.val);
        }
        return integers;
    }
    public List<Integer> preorder1(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null) {
            return output;
        }

        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            output.add(node.val);
            Collections.reverse(node.children);
            for (Node item : node.children) {
                stack.add(item);
            }
        }
        return output;
    }

    public List<Integer> ints = new ArrayList<Integer>();
    public List<Integer> preorder2(Node root) {
        if(root == null){
            return ints;
        }
        ints.add(root.val);
        List<Node> childrens = root.children;
        for(int i=0;i<childrens.size();i++){
            preorder2(childrens.get(i));
        }
        return ints;
    }
}
