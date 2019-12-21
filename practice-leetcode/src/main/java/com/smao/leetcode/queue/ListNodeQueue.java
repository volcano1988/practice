package com.smao.leetcode.queue;

import com.cc.common.base.ListNode;

/**
 * 用链表实现一个队列
 */
public class ListNodeQueue {
    private ListNode listNode;
    private ListNode tail;
    private ListNode head;

    public ListNodeQueue(int root) {
        listNode = new ListNode(root);
        tail = listNode;
        head = listNode;
    }

    public void push(int num){
        tail.next = new ListNode(num);
        tail = tail.next;
    }

    public Integer pop(){
        int temp = head.val;
        head = head.next;
        return temp;
    }
    public static void main(String[] args) {
        ListNodeQueue listNodeQueue = new ListNodeQueue(0);
        listNodeQueue.push(1);
        listNodeQueue.push(2);
        listNodeQueue.push(3);
        listNodeQueue.push(4);
        listNodeQueue.push(5);
        listNodeQueue.push(6);
        listNodeQueue.push(7);
        listNodeQueue.push(8);
        listNodeQueue.push(9);
        listNodeQueue.push(10);
        listNodeQueue.push(11);
        listNodeQueue.pop();
    }
}
