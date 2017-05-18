package com.zgwang.tree;

public class Solution404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }
        int num = 0;
        if(root.left != null){
            if(root.left.left == null && root.left.right == null){
                num += root.left.val;
            }else{
                num += sumOfLeftLeaves(root.left);
            }
        }
        num += sumOfLeftLeaves(root.right);
        return num;
    }
}
