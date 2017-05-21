package com.zgwang.hashtable;

import java.util.HashSet;

public class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int item : nums){
            if(!set.add(item)){
                return true;
            }
        }
        return false;
    }
}
