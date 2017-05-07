package com.zgwang.array;

public class Solution66 {
    public int[] plusOne(int[] digits) {
        int head = digits.length - 1;
        for(int i = head; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[head + 2];
        newDigits[0] = 1;
        return newDigits;
    }
}