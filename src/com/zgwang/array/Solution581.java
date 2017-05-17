package com.zgwang.array;

import java.util.Arrays;

public class Solution581 {
    public int findUnsortedSubarray(int[] nums) {
        int min = 0, max = 0;
        int[] temp = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            temp[i] = nums[i];
        }
        Arrays.sort(temp);
        for(int i = 0; i < nums.length; i++){
            if(temp[i] != nums[i]){
                min = i;
                break;
            }
        }
        for(int i = nums.length - 1; i > 0; i--){
            if(temp[i] != nums[i]){
                max = i;
                break;
            }
        }
        return ((max == 0) && (min == 0)) ? 0 : (max - min + 1);
    }
}
