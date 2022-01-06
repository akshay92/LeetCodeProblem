package com.leetcode.problem.solution.easy;

import com.leetcode.problem.solution.common.BinaryTree;
import com.leetcode.problem.solution.common.TreeNode;

public class SortedArrayToBinarySearchTree {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int arr[] = new int[]{-10, -3, 0, 5, 9};
        TreeNode root = sortedArrayToBST(arr);
        System.out.println("Preorder traversal of constructed BST");
        tree.preOrder(root);
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return getRoot(nums, 0, nums.length - 1);
    }

    public static TreeNode getRoot(int[] nums, int low, int hight) {

        if (low > hight) {
            return null;
        }

        TreeNode root = new TreeNode();
        int mid = (low + hight) / 2;
        root.val = nums[mid];

        root.left = getRoot(nums, low, mid - 1);
        root.right = getRoot(nums, mid + 1, hight);
        return root;

    }

}
