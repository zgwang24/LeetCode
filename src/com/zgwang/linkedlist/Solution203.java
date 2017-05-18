package com.zgwang.linkedlist;

public class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val){
            head = head.next;
        }
        ListNode fore = head, current = head;
        while(current != null){
            if(current.val == val){
                fore.next = current.next;
                current = fore;
            }else{
                fore = current;
                current = current.next;
            }
        }
        return head;
    }
}
