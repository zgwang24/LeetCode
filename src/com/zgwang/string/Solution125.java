package com.zgwang.string;

public class Solution125 {
    public boolean isPalindrome(String s) {
        if(s == null){
            return true;
        }
        int head = 0, tail = s.length() - 1;
        char headC, tailC;
        while(head < tail){
            headC = s.charAt(head);
            tailC = s.charAt(tail);
            if(!Character.isLetterOrDigit(headC)){
                head++;
            }else if(!Character.isLetterOrDigit(tailC)){
                tail--;
            }else {
                if(Character.toLowerCase(headC) != Character.toLowerCase(tailC)){
                    return false;
                }
                head++;
                tail--;
            }
        }
        return true; 
    }
}
