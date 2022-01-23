package com.leetcode.problem.solution.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MinimumNumberOfOperationsToMoveAllBallsToEachBox {

    public static void main(String[] args) {
        int []result = minOperations2("001011");

        for(int i =0; i<result.length;i++){
            System.out.println(result[i]);
        }

    }

    public static int[] minOperations(String boxes) {

        int []result = new int[boxes.length()];
        List<Integer> indexList = new ArrayList<>();

        for(int i=0;i<boxes.length();i++){
            if(boxes.charAt(i)== '1'){
                indexList.add(i);
            }
        }

        for(int i=0; i< boxes.length();i++){
            int count =0;
            for(Integer index : indexList){
                if(i!=index){
                    count = count + Math.abs(index-i);
                }
            }
            result[i] = count;
        }

        return result;
    }

    public static int[] minOperations2(String boxes) {

        int length = boxes.length();
        int [] result = new int[length];
        int [] left = new int[boxes.length()];
        int [] right = new int[boxes.length()];


        int count = boxes.charAt(0) - '0';
        for(int i=1;i<length;i++){
            left[i] =  left[i-1]+ count;
            count=count+boxes.charAt(i)-'0';
        }

        int count1 = boxes.charAt(length-1) - '0';
        for(int i=length-2;i>=0;i--){
            right[i] =  right[i+1]+count1;
            count1 = count1 + boxes.charAt(i)-'0';
        }

        for(int i = 0;i<length;i++){
            result[i]=left[i]+right[i];
        }

        return result;


    }

}
