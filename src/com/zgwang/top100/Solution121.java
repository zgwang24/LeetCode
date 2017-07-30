package com.zgwang.top100;

public class Solution121 {
    public int maxProfit(int[] prices) {
        if(prices.length == 0){
            return 0;
        }
        int min = prices[0], max = 0;
        for(int i = 1; i < prices.length; i++){
            min = Math.min(min, prices[i]);
            max = Math.max(max, prices[i] - min);
        }
        return max;
    }
}