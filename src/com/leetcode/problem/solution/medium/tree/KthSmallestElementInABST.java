package com.leetcode.problem.solution.medium.tree;

import com.leetcode.problem.solution.common.TreeNode;

import java.util.Stack;

public class KthSmallestElementInABST {

//    Solution 1
//    public int kthSmallest(TreeNode root, int k) {
//        Stack<TreeNode> stack = new Stack<>();
//
//        while (root != null){
//            stack.push(root);
//            root = root.left;
//        }
//
//        while (k!=0){
//            root = stack.pop();
//            k--;
//            if(k==0) return root.val;
//
//            TreeNode right = root.right;
//
//            while (right != null){
//                stack.push(right);
//                right = right.left;
//            }
//        }
//
//        return -1;
//    }

    private static int count;
    private static int n;

    public int kthSmallest(TreeNode root, int k) {
        count = k;
        helper(root);
        return n;
    }

    public void helper(TreeNode root){
        if(root == null){
            return;
        }

        helper(root.left);
        count--;
        if(count == 0) {
            n= root.val;
            return;
        }
        helper(root.right);
    }
}
