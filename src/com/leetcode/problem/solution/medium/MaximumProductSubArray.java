package com.leetcode.problem.solution.medium;

public class MaximumProductSubArray {


    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{-2,0,-1}));
        System.out.println(maxProduct(new int[]{2,3,-2,4}));
        System.out.println(maxProduct(new int[]{-2,3,-4}));
        System.out.println(maxProduct(new int[]{2,-5,-2,-4,3}));
    }

    public static int maxProduct(int[] nums) {
        int maxSofar = nums[0];
        int maxEnd = maxSofar;
        int minEnd = maxSofar;

        for(int i=1;i< nums.length;i++){

            if(nums[i]<0){
                int temp = maxEnd;
                maxEnd = minEnd;
                minEnd = temp;
            }

          maxEnd = Math.max(nums[i],maxEnd*nums[i]);
          minEnd = Math.min(nums[i],minEnd*nums[i]);

          maxSofar= Math.max(maxSofar, maxEnd);
        }

        return maxSofar;
     }
}
