package com.leetcode.problem.solution.common;

public class BinaryTree {
    public TreeNode root;

    /* A utility function to print preorder traversal of BST */
   public void preOrder(TreeNode node) {
        if (node == null) {
            System.out.print(node+ " ");
            return;
        }
        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
}
