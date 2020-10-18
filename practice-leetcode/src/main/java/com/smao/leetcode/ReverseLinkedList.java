package com.smao.leetcode;

import com.practice.common.base.ListNode;

/**
 * 206. 反转链表
 *
 * 反转一个单链表。
 *
 * 示例:
 *
 *      输入: 1->2->3->4->5->NULL
 *      输出: 5->4->3->2->1->NULL
 * 进阶:
 *      你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 *
 * 思路：
 * 假设存在链表 1 → 2 → 3 → Ø，我们想要把它改成 Ø ← 1 ← 2 ← 3。在遍历列表时，将当前节点的 next 指针改为指向前一个元素。
 * 由于节点没有引用其上一个节点，因此必须事先存储其前一个元素。在更改引用之前，还需要另一个指针来存储下一个节点。不要忘记在最后返回新的头引用！
 * 1->2->3
 *
 *
 * 链接：https://leetcode-cn.com/problems/reverse-linked-list
 */
public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        if(head == null||head.next==null){
            return head;
        }
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

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);
        reverseList(root);
    }
}
