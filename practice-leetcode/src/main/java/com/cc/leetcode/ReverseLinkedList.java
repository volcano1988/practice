package com.cc.leetcode;

import com.cc.common.base.ListNode;

/**
 * 反转一个单链表。
 *
 * @author cuilongcan
 * @create 2020-01-16
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head!=null&&head.next!=null){
            ListNode node = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return node;
        } else{
            return head;
        }
    }
}
