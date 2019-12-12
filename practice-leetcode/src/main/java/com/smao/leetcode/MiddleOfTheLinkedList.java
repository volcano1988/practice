package com.smao.leetcode;

import com.cc.common.base.ListNode;

/**
 * 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
 *
 * 如果有两个中间结点，则返回第二个中间结点。
 *
 * 示例 1：
 *
 * 输入：[1,2,3,4,5]
 * 输出：此列表中的结点 3 (序列化形式：[3,4,5])
 * 返回的结点值为 3 。 (测评系统对该结点序列化表述是 [3,4,5])。
 * 注意，我们返回了一个 ListNode 类型的对象 ans，这样：
 * ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, 以及 ans.next.next.next = NULL.
 * 示例 2：
 *
 * 输入：[1,2,3,4,5,6]
 * 输出：此列表中的结点 4 (序列化形式：[4,5,6])
 * 由于该列表有两个中间结点，值分别为 3 和 4，我们返回第二个结点。
 *  
 *
 * 提示：
 * 给定链表的结点数介于 1 和 100 之间。
 *
 * 链接：https://leetcode-cn.com/problems/middle-of-the-linked-list
 */
public class MiddleOfTheLinkedList {
    //方法一(很繁琐，可直接看方法二)
    public static ListNode middleNode(ListNode head) {
        ListNode left = head;
        ListNode right = head;
        ListNode temp = head;
        int length = 0;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        for(int i=1;i<=(length%2==0?length/2:length/2+1);i++){
            left = left.next;
        }
        while(left!=null){
            left = left.next;
            right = right.next;
        }
        return right;
    }
    //方法2
    public static ListNode middleNode2(ListNode head) {
        ListNode left = head;
        ListNode right = head;
        while(right!=null && right.next!=null){
            left = left.next;
            right = right.next.next;
        }
        return left;
    }
    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);
        root.next.next.next.next.next = new ListNode(6);
        ListNode r = middleNode2(root);
        System.out.println("111111111");
    }
}
