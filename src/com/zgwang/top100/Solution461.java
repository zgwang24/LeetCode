package com.zgwang.top100;

public class Solution461 {
    public int hammingDistance1(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
    public int hammingDistance2(int x, int y) {
        int xor = x ^ y, count = 0;
        while(xor > 0){
            count += (xor) & 1;
            xor >>= 1;
        }
        return count;
    }
}