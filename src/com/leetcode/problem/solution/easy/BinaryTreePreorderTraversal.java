package com.leetcode.problem.solution.easy;

import com.leetcode.problem.solution.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        updateInorderTraversal(root, list);
        return list;
    }

    public void updateInorderTraversal(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }

        list.add(root.val);
        updateInorderTraversal(root.left, list);
        updateInorderTraversal(root.right, list);
    }
}
