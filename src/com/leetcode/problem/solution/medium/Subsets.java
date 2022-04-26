package com.leetcode.problem.solution.medium;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, nums, new ArrayList<>(), 0);
        return list;
    }

    public void backtrack(List<List<Integer>> list,
                          int[] nums, ArrayList<Integer> tempList, int start) {
        list.add(new ArrayList<>(tempList));

        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtrack(list, nums, tempList, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }





}
