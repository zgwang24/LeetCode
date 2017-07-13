package com.zgwang.top100;

import java.util.HashMap;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for(int i = 0, j = 0; i < s.length(); i++){
            if(hm.containsKey(s.charAt(i))){
                j = Math.max(j, hm.get(s.charAt(i)) + 1);
            }
            hm.put(s.charAt(i), i);
            res = Math.max(res, i - j + 1);
        }
        return res;
    }
}