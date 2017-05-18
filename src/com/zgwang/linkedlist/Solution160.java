package com.zgwang.linkedlist;

public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int k = 0, d = 0, aLen = 0, bLen = 0;
        ListNode temp, tempA = headA, tempB = headB;
        while(tempA != null){
            aLen++;
            tempA = tempA.next;
        }
        while(tempB != null){
            bLen++;
            tempB = tempB.next;
        }
        if(aLen < bLen){
            temp = headA;
            headA = headB;
            headB = temp;
            d = bLen - aLen;
        }else{
            d = aLen - bLen;
        }
        while(k < d){
            headA = headA.next;
            k++;
        }
        for(int i = 0; i < bLen; i++){
            if(headA == headB){
                return headA;
            }else{
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }
}
