package com.leetcode.problem.solution.medium;

public class SortColors {


    public void sortColors(int[] nums) {
        int countZero = 0;
        int countOne = 0;

        for (int i = 0; i < nums.length; i++) {

            switch (nums[i]) {
                case 0:
                    countZero++;
                    break;
                case 1:
                    countOne++;
                    break;
            }
        }


        for(int i = 0; i < nums.length; i++){
            if(countZero!=0){
                countZero--;
                nums[i] = 0;
            }
            else if(countOne!=0){
                countOne--;
                nums[i] = 1;
            }
            else {
                nums[i] = 2;
            }
        }
    }
}
