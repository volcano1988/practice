package com.smao.leetcode;

import com.practice.common.base.ListNode;

/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 * 示例：
 *
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 *
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 *
 * 给定的 n 保证是有效的。
 *
 * 链接：https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list
 */
public class RemoveNthNodeFromEndOfList {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = reverseList(head);
        if(n == 1){
            return reverseList(temp.next);
        }
        ListNode root = temp;
        ListNode pre = temp;
        int index = 1;
        while(temp!=null){
            if(index == n){
                pre.next = pre.next.next;
                break;
            }
            if(temp.next==null){
                return reverseList(temp);
            }
            pre = temp;
            temp = temp.next;
            index++;
        }
        root = reverseList(root);
        return root;
    }
    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);
        removeNthFromEnd(root, 2);
    }

    private static ListNode reverseList(ListNode head) {
        //先反转链表
        ListNode pre = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
