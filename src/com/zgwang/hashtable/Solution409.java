package com.zgwang.hashtable;

import java.util.HashSet;

public class Solution409 {
    public int longestPalindrome(String s) {
        int count = 0;
        HashSet<Character> set = new HashSet<Character>();
        for(int i = 0; i < s.length(); i++){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(i));
                count++;
            }else{
                set.add(s.charAt(i));
            }
        }
        if(set.isEmpty()){
            return count * 2;
        }else{
            return count * 2 + 1;
        }
    }
}
