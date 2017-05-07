package com.zgwang.array;

import java.util.HashSet;

public class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        if(nums == null || nums.length == 0){
            return false;
        }
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}