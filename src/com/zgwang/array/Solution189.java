package com.zgwang.array;

public class Solution189 {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    private void reverse(int[] nums, int start, int end){
        while(start < end){
            nums[start] = (nums[start] + nums[end]) - (nums[end] = nums[start]);
            start++;
            end--;
        }
    }
}
