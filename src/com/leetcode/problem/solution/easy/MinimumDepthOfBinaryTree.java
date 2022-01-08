package com.leetcode.problem.solution.easy;

import com.leetcode.problem.solution.common.BinaryTree;
import com.leetcode.problem.solution.common.TreeNode;

public class MinimumDepthOfBinaryTree {
    public static void main(String[] args) {
        //[2,null,3,null,4,null,5,null,6]
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.right.right = new TreeNode(4);
        tree.root.right.right.right = new TreeNode(5);
        tree.root.right.right.right.right = new TreeNode(6);

        BinaryTree tree1 = new BinaryTree();
        tree1.root = new TreeNode(1);
        tree1.root.left = new TreeNode(2);
        tree1.root.right = new TreeNode(3);
        tree1.root.left.left = new TreeNode(4);
        tree1.root.left.right = new TreeNode(5);

        System.out.println("The minimum depth of " +
                "binary tree is : " + minDepth(tree.root));

        System.out.println("The minimum depth of " +
                "binary tree is : " + minDepth(tree1.root));
    }

    public static int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int ln = 0;
        if (root.left != null) {
            ln = minDepth(root.left);
        }

        int rn = 0;

        if (root.right != null) {
            rn = minDepth(root.right);
        }

        if (ln == 0) {
            return 1 + rn;
        } else if (rn == 0) {
            return 1 + ln;
        } else {
            return 1 + Math.min(ln, rn);
        }

    }


}
