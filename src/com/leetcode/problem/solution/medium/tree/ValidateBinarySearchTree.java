package com.leetcode.problem.solution.medium.tree;

import com.leetcode.problem.solution.common.TreeNode;

public class ValidateBinarySearchTree {

    TreeNode pre;

    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }

        if(!isValidBST(root.left)){
            return false;
        }

        if(pre != null && root.val <= pre.val) return false;

        pre = root;

        if(!isValidBST(root.right)){
            return false;
        }

        return true;
    }

}
