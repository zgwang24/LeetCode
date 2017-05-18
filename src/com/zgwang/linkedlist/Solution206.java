package com.zgwang.linkedlist;

public class Solution206 {
    public ListNode reverseList(ListNode head) {
        ListNode tempNode = null, nextNode = null;
        while(head != null){
            nextNode = head.next;
            head.next = tempNode;
            tempNode = head;
            head = nextNode;
        }
        return tempNode;
    }
}
