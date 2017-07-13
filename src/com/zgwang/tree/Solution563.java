package com.zgwang.tree;

public class Solution563 {
    public int findTilt(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 0;
        }
        if(root.left == null){
            return Math.abs(sumNode(root.right)) + findTilt(root.right);
        }
        if(root.right == null){
            return Math.abs(sumNode(root.left)) + findTilt(root.left);
        }
        return Math.abs(sumNode(root.right) - sumNode(root.left)) + findTilt(root.left) + findTilt(root.right);
    }
    private int sumNode(TreeNode node){
        if(node == null){
            return 0;
        }
        return node.val + sumNode(node.left) + sumNode(node.right);
    }
}
