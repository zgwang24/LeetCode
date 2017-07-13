package com.zgwang.top100;

public class Solution206 {
    public ListNode reverseList(ListNode head) {
        ListNode temp = null, next = null;
        while(head != null){
            next = head.next;
            head.next = temp;
            temp = head;
            head = next;
        }
        return temp;
    }
}