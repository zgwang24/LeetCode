package com.zgwang.hashtable;

import java.util.HashSet;

public class Solution575 {
    public int distributeCandies(int[] candies) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int item : candies){
            set.add(item);
        }
        if(set.size() > candies.length / 2){
            return candies.length / 2;
        }else{
            return set.size();
        }
    }
}