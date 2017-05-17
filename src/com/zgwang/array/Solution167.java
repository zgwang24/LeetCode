package com.zgwang.array;

public class Solution167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] indexs = new int[2];
        if(numbers == null || numbers.length < 2 ){
            return indexs;
        }
        int left = 0, right = numbers.length - 1;
        while(left < right){
            if(numbers[left] + numbers[right] == target){
                indexs[0] = left + 1;
                indexs[1] = right + 1;
                break;
            }else if(numbers[left] + numbers[right] < target){
                left++;
            }else{
                right--;
            }
        }
        return indexs;
    }
}
