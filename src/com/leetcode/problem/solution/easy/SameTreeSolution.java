package com.leetcode.problem.solution.easy;

import com.leetcode.problem.solution.common.BinaryTreeTwoRoot;
import com.leetcode.problem.solution.common.TreeNode;

public class SameTreeSolution {

    public static void main(String[] args) {

        // Test Case 1 Both tree are same
        BinaryTreeTwoRoot tree = new BinaryTreeTwoRoot();

        tree.root1 = new TreeNode(1);
        tree.root1.left = new TreeNode(2);
        tree.root1.right = new TreeNode(3);
        tree.root1.left.left = new TreeNode(4);
        tree.root1.left.right = new TreeNode(5);

        tree.root2 = new TreeNode(1);
        tree.root2.left = new TreeNode(2);
        tree.root2.right = new TreeNode(3);
        tree.root2.left.left = new TreeNode(4);
        tree.root2.left.right = new TreeNode(5);

        if (isSameTree(tree.root1, tree.root2))
            System.out.println("Both trees are identical");
        else
            System.out.println("Trees are not identical");


        // Test Case 2 Both tree are not same
        BinaryTreeTwoRoot tree2 = new BinaryTreeTwoRoot();

        tree2.root1 = new TreeNode(1);
        tree2.root1.left = new TreeNode(2);
        tree2.root1.right = new TreeNode(3);
        tree2.root1.left.left = new TreeNode(4);
         tree.root1.left.right = new TreeNode(9);

        tree2.root2 = new TreeNode(1);
        tree2.root2.left = new TreeNode(2);
        tree2.root2.right = new TreeNode(3);
        tree2.root2.left.left = new TreeNode(4);
        tree2.root2.left.right = new TreeNode(5);

        if (isSameTree(tree2.root1, tree2.root2))
            System.out.println("Both trees are identical");
        else
            System.out.println("Trees are not identical");

        // Test Case 3 Root1 null
        BinaryTreeTwoRoot tree3 = new BinaryTreeTwoRoot();

        tree3.root2 = new TreeNode(1);
        tree3.root2.left = new TreeNode(2);
        tree3.root2.right = new TreeNode(3);
        tree3.root2.left.left = new TreeNode(4);
        tree3.root2.left.right = new TreeNode(5);

        if (isSameTree(tree3.root1, tree3.root2))
            System.out.println("Both trees are identical");
        else
            System.out.println("Trees are not identical");

        // Test Case 4 Root2 null
        BinaryTreeTwoRoot tree4 = new BinaryTreeTwoRoot();

        tree4.root2 = new TreeNode(1);
        tree4.root2.left = new TreeNode(2);
        tree4.root2.right = new TreeNode(3);
        tree4.root2.left.left = new TreeNode(4);
        tree4.root2.left.right = new TreeNode(5);

        if (isSameTree(tree4.root1, tree4.root2))
            System.out.println("Both trees are identical");
        else
            System.out.println("Trees are not identical");

    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        // Both null
        if(q == null && p == null){
          return true;
        }

        // Anyone is null
        if(q == null || p == null){
            return false;
        }

        // Comparing node value and call isSameTree with left and right node
        return q.val == p.val &&
                isSameTree(p.left, q.left) &&
                isSameTree(p.right, q.right);
    }
}
