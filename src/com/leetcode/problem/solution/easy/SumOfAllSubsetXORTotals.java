package com.leetcode.problem.solution.easy;

public class SumOfAllSubsetXORTotals {

    public static void main(String[] args) {
    System.out.println(subsetXORSum(new int[] {1,3}));
    }

    public static int subsetXORSum(int[] nums) {
      return helperBacktrack(nums, 0, 0);
    }

    public static int helperBacktrack(int[] nums, int currentXor, int index){

        if(nums.length == index){
            return currentXor;
        }

        int withItem = helperBacktrack(nums, currentXor ^ nums[index],index+1);
        int withOutItem = helperBacktrack(nums, currentXor,index+1);

        return withItem+withOutItem;
    }


}
