package com.leetcode.problem.solution.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        List<List<Integer>> result = threeSum(new int[]{0,0,0,0});

        for (List<Integer> item : result) {
            System.out.println(item.toString());
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i =0; i<nums.length-2;i++) {
            if(i==0 || nums[i] != nums[i-1]){
                int low =i+1;
                int high = nums.length-1;
                int sum = 0- nums[i];
                while (low < high){
                    if (nums[low]+nums[high] == sum){
                        result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while(low < high && nums[low]== nums[low+1]) low++;
                        while(low < high && nums[high] == nums[high-1]) high--;
                        low++;
                        high--;
                    }
                    else if (nums[low]+nums[high] < sum){
                        while(low < high && nums[low]== nums[low+1]) low++;
                        low++;
                    }
                    else{
                        while(low < high && nums[high] == nums[high-1]) high--;
                        high--;
                    }
                }
            }
        }
        return result;
    }

}
