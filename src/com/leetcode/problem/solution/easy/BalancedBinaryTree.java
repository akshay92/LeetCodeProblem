package com.leetcode.problem.solution.easy;

import com.leetcode.problem.solution.common.BinaryTree;
import com.leetcode.problem.solution.common.TreeNode;

public class BalancedBinaryTree {


    class Height {
        int height = 0;
    }


    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.right = new TreeNode(6);
        tree.root.left.left.left = new TreeNode(7);

        if (isBalanced(tree.root))
            System.out.println("Tree is balanced");
        else
            System.out.println("Tree is not balanced");
    }

    public static boolean isBalanced(TreeNode root) {

        if (root == null) {
            return true;
        }

        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);

        if (Math.abs(leftDepth - rightDepth) <= 1 && isBalanced(root.left) && isBalanced(root.right) ) {
            return true;
        }

        return false;
    }

    public boolean isBalanced(TreeNode root, Height height) {

        if (root == null) {
            height.height = 0;
            return true;
        }

        Height lHeight = new Height(), rHeight = new Height();
        boolean l = isBalanced(root, lHeight);
        boolean r = isBalanced(root, rHeight);

        int lh = lHeight.height, rh = rHeight.height;

        height.height = (lh > rh ? lh : rh) + 1;
        if(Math.max(lh, rh) >= 2){
          return false;
        }
        else{
           return  l && r;
        }
    }


    public static int getDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        return 1 + Math.max(getDepth(root.left),getDepth(root.right) );
    }
}
