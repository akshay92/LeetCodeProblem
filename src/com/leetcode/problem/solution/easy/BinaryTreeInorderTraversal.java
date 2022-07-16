package com.leetcode.problem.solution.easy;

import com.leetcode.problem.solution.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    public static void main(String[] args) {

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        updateInorderTraversal(root, list);
        return list;
    }

    public void updateInorderTraversal(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }

        updateInorderTraversal(root.left, list);
        list.add(root.val);
        updateInorderTraversal(root.right, list);
    }
}
