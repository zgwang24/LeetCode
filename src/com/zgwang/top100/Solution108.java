package com.zgwang.top100;

public class Solution108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0){
            return null;
        }
        TreeNode root = build(nums, 0, nums.length - 1);
        return root;
    }
    private TreeNode build(int[] nums, int lo, int hi){
        if(hi < lo){
            return null;
        }
        int mid = (hi + lo) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = build(nums, lo, mid - 1);
        node.right = build(nums, mid + 1, hi);
        return node;
    }
}