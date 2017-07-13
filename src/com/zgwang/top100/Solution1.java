package com.zgwang.top100;

import java.util.HashMap;

public class Solution1 {
	// n*n
	public int[] twoSum1(int[] nums, int target) {
        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                int val = nums[i] + nums[j];
                if(val == target){
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res; 
    }
	// n
	public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++){           
            if(hm.containsKey(target - nums[i])){
                res[0] = hm.get(target - nums[i]);
                res[1] = i;
            }else{
                hm.put(nums[i], i);
            }
        }
        return res;
    }
}
