package com.leetcode.problem.solution.easy;

public class BinaryToDecimalConversion {

    public static void main(String[] args) {
        System.out.println("Number "+convertBinaryToDecimal(100001));
    }

    public static int convertBinaryToDecimal(int num){
        int index = 0;
        int decimal = 0;

        while(num!=0){
            int mod  = num % 10;

            if(mod == 1){
                decimal = (int) (decimal + Math.pow(2, index));
            }

            num = num/10;
            index++;
        }

        return decimal;
    }

}
