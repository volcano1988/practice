package com.smao.leetcode.stack;

import com.cc.common.base.ListNode;

/**
 * 链表实现栈
 */
public class ListNodeStack {
    private ListNode listNode;
    private int size;//栈内元素个数
    private ListNode end;//结尾
    private ListNode pre;//end前面节点

    public ListNodeStack(int root) {
        this.listNode = new ListNode(root);
        this.end = this.listNode;
        this.pre = null;
        this.size++;
    }

    public boolean push(int node){
        this.pre = this.end;
        this.end.next = new ListNode(node);
        this.end = end.next;
        this.size++;
        return true;
    }

    public void pop(){
        this.end = pre;
        this.pre.next = null;
        this.size--;
    }

    public static void main(String[] args) {
        ListNodeStack listNodeStack = new ListNodeStack(1);
        listNodeStack.push(2);
        listNodeStack.push(3);
        listNodeStack.push(4);
        listNodeStack.push(5);
        System.out.println(listNodeStack.size);
        listNodeStack.pop();
        System.out.println(listNodeStack.size);
    }
}
