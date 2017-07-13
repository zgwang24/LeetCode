package com.zgwang.top100;

public class Solution538 {
    public TreeNode convertBST(TreeNode root) {
        convert(root, 0);
        return root;
    }
    private int convert(TreeNode root, int sum){
        if(root == null){
            return sum;
        }
        int res = convert(root.right, sum);
        root.val += res;
        return convert(root.left, root.val);
    }
}