package com.zgwang.binarysearch;

public class Solution441 {
    public int arrangeCoins(int n) {
        int res = 0, len = n;
        for(int i = 0; i <= len; i++){
            if(n >= (i + 1)){
                n = n - (i + 1);
            }else{
                res = i;
                break;
            }
        }
        return res;
    }
}