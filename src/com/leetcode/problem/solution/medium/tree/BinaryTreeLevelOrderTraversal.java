package com.leetcode.problem.solution.medium.tree;

import com.leetcode.problem.solution.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrderSolution1(TreeNode root) {

        if (root == null) {
            return new ArrayList();
        }

        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        while (queue.isEmpty() == false) {
            List<Integer> innerList = new ArrayList();
            Queue<TreeNode> tempQueue = new LinkedList();

            for (TreeNode item : queue) {
                innerList.add(item.val);

                if (item.left != null) {
                    tempQueue.add(item.left);
                }

                if (item.right != null) {
                    tempQueue.add(item.right);
                }
            }

            queue = tempQueue;
            list.add(innerList);
        }

        return list;
    }

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> levelOrderSolution2(TreeNode root) {
        bfs(root, 0);
        return ans;
    }

    public void bfs(TreeNode root, int level) {
//         incase root is null
        if (root == null)
            return;
//         if size of our ans(list inside list) is <level+1
        if (ans.size() < level + 1)
            ans.add(new ArrayList<>());
        ans.get(level).add(root.val);
        bfs(root.left, level + 1);
        bfs(root.right, level + 1);
    }

}
