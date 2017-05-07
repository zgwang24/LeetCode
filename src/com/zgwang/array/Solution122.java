package com.zgwang.array;

public class Solution122 {
    public int maxProfit(int[] prices) {
        int total = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i-1]){
                total = total + (prices[i] - prices[i - 1]);
            }
        }
        return total;
    }
}
