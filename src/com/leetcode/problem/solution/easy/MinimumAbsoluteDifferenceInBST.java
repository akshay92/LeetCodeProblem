package com.leetcode.problem.solution.easy;

import com.leetcode.problem.solution.common.TreeNode;

public class MinimumAbsoluteDifferenceInBST {

    TreeNode pre = null;
    int min = Integer.MAX_VALUE;

    public static void main(String[] args) {

    }

    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return min;
    }

    public void inorder(TreeNode root) {

        if (root == null) {
            return;
        }

        inorder(root.left);

        if (pre != null) min = Math.min(min, root.val - pre.val);
        pre = root;

        inorder(root.right);
    }
}
