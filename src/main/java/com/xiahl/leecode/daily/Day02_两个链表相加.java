package com.xiahl.leecode.daily;

import lombok.Builder;
import lombok.Data;

/**
 * @author xiahl
 * @version 1.0
 * @date 2021/4/29 16:22
 * @Desc: 给你两个非空的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * <p>
 * 思路1:存新的链表            两个链表的对应的值相加,超过10的话,向前进一,然后存入一个新的链表中 空间复杂度为O(max(a,b))
 * 思路2:存已经存在的链表中
 */
public class Day02_两个链表相加 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode().builder().val(2).next(new ListNode(8, new ListNode(8, new ListNode()))).build();
        ListNode listNode2 = new ListNode().builder().val(7).next(new ListNode(5, new ListNode(4, new ListNode()))).build();
        ListNode listNode = addTwoNumbers(listNode1, listNode2);
        System.out.println(listNode);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(l1.val + l2.val);
        ListNode cur = head;
        while (l1.next != null || l2.next != null) {
            l1 = l1.next != null ? l1.next : new ListNode();
            l2 = l2.next != null ? l2.next : new ListNode();
            cur.next = new ListNode(l1.val + l2.val + cur.val / 10);
            cur.val %= 10;
            cur = cur.next;
        }
        if (cur.val >= 10) {
            cur.next = new ListNode(cur.val / 10);
            cur.val %= 10;
        }
        return head;

    }

    @Data
    @Builder
    static
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
