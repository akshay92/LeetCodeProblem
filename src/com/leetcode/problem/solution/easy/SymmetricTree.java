package com.leetcode.problem.solution.easy;

import com.leetcode.problem.solution.common.BinaryTree;
import com.leetcode.problem.solution.common.TreeNode;

public class SymmetricTree {


    public static void main(String[] args) {

        // Test case 1 when tree is symmetric
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(2);
        tree.root.left.left = new TreeNode(3);
        tree.root.left.right = new TreeNode(4);
        tree.root.right.left = new TreeNode(4);
        tree.root.right.right = new TreeNode(3);
        if (isSymmetric(tree.root))
            System.out.println("Symmetric");
        else
            System.out.println("Not symmetric");

        // Test case 2 when tree is not symmetric
        BinaryTree tree1 = new BinaryTree();
        tree1.root = new TreeNode(1);
        tree1.root.left = new TreeNode(2);
        tree1.root.right = new TreeNode(2);
        tree1.root.left.left = new TreeNode(3);
        tree1.root.left.right = new TreeNode(4);
        tree1.root.right.left = new TreeNode(4);
        tree1.root.right.right = new TreeNode(9);
        if (isSymmetric(tree1.root))
            System.out.println("Symmetric");
        else
            System.out.println("Not symmetric");

        // Test case 3 when tree is not symmetric left side all node
        BinaryTree tree2 = new BinaryTree();
        tree2.root = new TreeNode(1);
        tree2.root.left = new TreeNode(2);
        tree2.root.left.left = new TreeNode(3);
        tree2.root.left.right = new TreeNode(4);
        if (isSymmetric(tree2.root))
            System.out.println("Symmetric");
        else
            System.out.println("Not symmetric");

        // Test case 4 when tree is not symmetric right side
        BinaryTree tree3 = new BinaryTree();
        tree3.root = new TreeNode(1);
        tree3.root.left = new TreeNode(2);
        tree3.root.right = new TreeNode(2);
        tree3.root.right.right = new TreeNode(9);

        if (isSymmetric(tree3.root))
            System.out.println("Symmetric");
        else
            System.out.println("Not symmetric");


        // Test case 5 when tree is null
        BinaryTree tree4 = new BinaryTree();
        tree4.root = null;

        if (isSymmetric(tree4.root))
            System.out.println("Symmetric");
        else
            System.out.println("Not symmetric");

        // Test case 6 when tree single node
        BinaryTree tree5 = new BinaryTree();
        tree5.root = new TreeNode(1);

        if (isSymmetric(tree5.root))
            System.out.println("Symmetric");
        else
            System.out.println("Not symmetric");

    }

    public static boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }
        return compareLeftAndRight(root.left, root.right);

    }

    public static boolean compareLeftAndRight(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }

        if (left != null && right != null && left.val == right.val) {
            return compareLeftAndRight(left.left, right.right) && compareLeftAndRight(left.right, right.left);
        }

        return false;
    }

}
