package com.leetcode.problem.solution.easy;

import com.leetcode.problem.solution.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        updateInorderTraversal(root, list);
        return list;
    }

    public void updateInorderTraversal(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }

        updateInorderTraversal(root.left, list);
        updateInorderTraversal(root.right, list);
        list.add(root.val);
    }
}
