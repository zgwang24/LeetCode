package com.zgwang.array;

public class Solution414 {
    public int thirdMax(int[] nums) {
        Integer first = null, second = null, third = null;
        for(Integer item : nums){
            if(item.equals(first) || item.equals(second) || item.equals(third)){
                continue;
            }
            if(first == null || item > first){
                third = second;
                second = first;
                first = item;
            }else if(second == null || item > second){
                third = second;
                second = item;
            }else if(third == null || item > third){
                third = item;
            }
        }
        return (third == null) ? first : third;
    }
}