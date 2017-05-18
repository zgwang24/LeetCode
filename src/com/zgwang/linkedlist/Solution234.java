package com.zgwang.linkedlist;

public class Solution234 {
    public boolean isPalindrome(ListNode head) {
        // ͳ��������
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        // ��ת����
        int i = 0, mid = len / 2;
        temp = head;
        while(i < mid){
            temp = temp.next;
            i++;
        }
        temp = reverseList(temp);
        // �ж�
        i = 0;
        while(i < mid){
            if(temp.val == head.val){
                temp = temp.next;
                head = head.next;
                i++;
            }else{
                return false;
            }
        }
        return true;
        
    }
    private ListNode reverseList(ListNode head) {
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
