package com.leetcode.problem.solution.easy;

import com.leetcode.problem.solution.common.BinaryTree;
import com.leetcode.problem.solution.common.TreeNode;

public class MaximumDepthOfBinaryTree {

    public static void main(String[] args) {
        // Test case 1 expect length 3
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("Height of tree is : " +
                maxDepth(tree.root));

        // Test case 2 expect length 4
        BinaryTree tree1 = new BinaryTree();
        tree1.root = new TreeNode(1);
        tree1.root.left = new TreeNode(2);
        tree1.root.right = new TreeNode(3);
        tree1.root.left.left = new TreeNode(4);
        tree1.root.left.right = new TreeNode(5);
        tree1.root.left.right.right = new TreeNode(6);


        System.out.println("Height of tree is : " +
                maxDepth(tree1.root));

        // Test case 3 expect length 1
        BinaryTree tree2 = new BinaryTree();
        tree2.root = new TreeNode(1);

        System.out.println("Height of tree is : " +
                maxDepth(tree2.root));


        // Test case 4 expect length 1
        BinaryTree tree3 = new BinaryTree();
        tree3.root = new TreeNode(1);
        tree3.root.left = new TreeNode(2);

        System.out.println("Height of tree is : " +
                maxDepth(tree2.root));
    }

    public static int maxDepth(TreeNode root) {

        if(root == null){
            return 0;
        }

        int leftLength = 1 + maxDepth(root.left);
        int rightLength = 1 + maxDepth(root.right);

        if(leftLength > rightLength){
            return leftLength;
        }
        else {
            return rightLength;
        }

    }
}

