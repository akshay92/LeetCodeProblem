package com.leetcode.problem.solution.medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {

        List<List<Integer>> list = getPermutation(new int[]{1,2,3});
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    private static List<List<Integer>> getPermutation(int[] num){
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        backtrack(list, new ArrayList<>(), num);
        return list;
    }

    public static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] num){

        if(tempList.size() == num.length){
            list.add(new ArrayList(tempList));
        }
        else{
            for (int i=0; i < num.length;i++ ){
                if(tempList.contains(num[i])){
                   continue;
                }

                tempList.add(num[i]);
                backtrack(list, tempList, num);
                tempList.remove(tempList.size()-1);
            }
        }

    }



}


