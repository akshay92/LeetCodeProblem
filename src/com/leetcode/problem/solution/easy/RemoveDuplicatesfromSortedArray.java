package com.leetcode.problem.solution.easy;

public class RemoveDuplicatesfromSortedArray {

    public static void main(String[] args) {
    System.out.println(removeDuplicates(new int[]{1,1,2}));
    }

    public static int removeDuplicates(int[] nums) {

        int lastValue = Integer.MIN_VALUE;
        int lastIndex = 0;
        int count = 0;

        for(int i=0;i< nums.length;i++){
            if(lastValue != nums[i]){
                count++;
                lastValue = nums[i];
                nums[lastIndex] = lastValue;
                lastIndex = lastIndex+1;
            }
        }

        return count;
    }
}
