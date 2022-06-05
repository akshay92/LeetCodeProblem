package com.leetcode.problem.solution.medium;

public class CapacityToShipPackagesWithinDDays {

    public static void main(String[] args) {
        System.out.println(shipWithinDays(new int[] {1,2,3,4,5,6,7,8,9,10}, 5));
    }

    public static int shipWithinDays(int[] weights, int D) {
      int left =0, right =0;
      for(int w : weights){
          left = Math.max(left, w);
          right=right+w;
      }

      while(left < right){
          int mid = (left+right)/2, cur =0, need = 1;
          for (int w: weights){
              if(cur+w > mid){
                  need++;
                  cur=0;
              }
              cur=cur+w;
          }

          if(need > D){
              left=mid+1;
          }
          else{
              right= mid;
          }
      }

      return left;
    }
}
