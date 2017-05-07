package com.zgwang.array;

public class Solution26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 2){
            return nums.length;
        }
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            nums[count++] = nums[i];
            while(i < nums.length - 1 && nums[i] == nums[i + 1]){
                i++;
            }
        }
        return count;
    }
}