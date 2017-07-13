package com.zgwang.top100;

public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode d = head;
        int sum = 0;
        while(l1 != null || l2 != null){
            sum /= 10;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            d.next = new ListNode(sum % 10);
            d = d.next;
        }
        if(sum / 10 == 1){
            d.next = new ListNode(1);
        }
        return head.next;
    }
}