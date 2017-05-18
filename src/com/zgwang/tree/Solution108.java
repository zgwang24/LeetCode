package com.zgwang.tree;

public class Solution108{
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0){
            return null;
        }
        TreeNode head = build(nums, 0, nums.length - 1);
        return head;
    }
    private TreeNode build(int[] nums, int lo, int hi){
        if(lo > hi){
            return null;
        }
        int mid = (hi + lo) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = build(nums, lo, mid - 1);
        node.right = build(nums, mid + 1, hi);
        return node;
    }
}
