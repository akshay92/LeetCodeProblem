package com.leetcode.problem.solution.medium;

import java.util.*;

public class TopKFrequentElements {

    public static void main(String[] args) {
        int[] result = topKFrequent(new int[]{ 7,7,6,6,8,9,7,11,1,5,6,7}, 6);
        for(int i=0;i< result.length;i++){
            System.out.println(result[i]);
        }
    }

    public static int[] topKFrequent(int[] nums, int k) {

        int [] result = new int[k];

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i <= nums.length; i++)
            list.add(new ArrayList<Integer>());

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            list.get(entry.getValue()).add(entry.getKey());
        }

        int count =0;
        for(int i= nums.length;i>0;i--)
        {
            for(int item : list.get(i)){
                result[count++]= item;
                if(count == k ){
                    return result;
                }
            }
        }

        return result;
    }
}
