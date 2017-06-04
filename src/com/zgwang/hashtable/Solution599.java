package com.zgwang.hashtable;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        ArrayList<String> list = new ArrayList<String>();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < list1.length; i++){
            hm.put(list1[i], i);
        }
        for(int i = 0; i < list2.length; i++){
            Integer k = hm.get(list2[i]);
            if(k != null && (i + k) <= min){
                if((i + k) < min){
                    list = new ArrayList<String>();
                    min = i + k;
                }
                list.add(list2[i]);
            }
        }
        return list.toArray(new String[list.size()]);
    }
}