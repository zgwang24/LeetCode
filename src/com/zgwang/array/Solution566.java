package com.zgwang.array;

public class Solution566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int n = nums.length, m = nums[0].length;
        if(n*m != r*c){
            return nums;
        }
        int[][] res = new int[r][c];
        for (int i = 0; i < r*c; i++){
            res[i/c][i%c] = nums[i/m][i%m];
        } 
        return res;
    }
}
