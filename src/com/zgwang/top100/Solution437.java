package com.zgwang.top100;

public class Solution437 {
    public int pathSum(TreeNode root, int sum) {
        if(root == null){
            return 0;
        }
        return find(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
    private int find(TreeNode root, int sum){
        int val = 0;
        if(root == null){
            return val;
        }
        if(sum == root.val){
            val++;
        }
        val += find(root.left, sum - root.val);
        val += find(root.right, sum - root.val);
        return val;
    }
}