package com.zgwang.array;

import java.util.HashMap;

public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(hm.containsKey(target - nums[i])){
                result[0] = hm.get(target - nums[i]);
                result[1] = i;
            }else{
                hm.put(nums[i], i);
            }
        }
        return result;
    }
}
