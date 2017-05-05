package com.zgwang.array;

public class Solution121 {
    public int maxProfit(int[] prices) {
        if(prices.length == 0){
            return 0;
        }
        int min = prices[0], max = 0;
        for(int i = 1; i < prices.length; i++){
            min = prices[i] < min? prices[i] : min;
            max = (prices[i] - min) > max? (prices[i] - min) : max;
        }
        return max;
    }
}