package com.leetcode.problem.solution.medium;

public class GasStation {

    public static void main(String[] args) {
        System.out.println(canCompleteCircuit(new int[]{2,3,4}, new int[]{3,4,3}));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int remainBalance = 0;
        int currentBalance = 0;
        int start = 0;

        for(int i=0;i<gas.length;i++){
            currentBalance += gas[i]-cost[i];
            if(currentBalance<0){
                remainBalance+=currentBalance;
                start=i+1;
                currentBalance=0;
            }
        }

        return remainBalance+currentBalance>=0 ? start : -1;

    }

//    public static int canCompleteCircuit(int[] gas, int[] cost) {
//
//        boolean isNeedToRunLoop;
//        int totalGasFill;
//        int circleStartIndex;
//        for(int i =0;i<gas.length;i++){
//            isNeedToRunLoop = true;
//            circleStartIndex = i;
//            int tempCircleStartIndex = circleStartIndex;
//            totalGasFill = gas[tempCircleStartIndex];
//            while (isNeedToRunLoop){
//                int totalRemainCost = totalGasFill-cost[tempCircleStartIndex];
//
//                if(tempCircleStartIndex < gas.length-1){
//                    tempCircleStartIndex++;
//                }
//                else{
//                    tempCircleStartIndex=0;
//                }
//
//                if(totalRemainCost<0 || tempCircleStartIndex == circleStartIndex){
//                    totalGasFill = totalRemainCost;
//                    isNeedToRunLoop = false;
//                    circleStartIndex = tempCircleStartIndex;
//                    continue;
//                }
//
//
//
//
//                totalGasFill = totalRemainCost + gas[tempCircleStartIndex];
//
//            }
//
//            if(totalGasFill >= 0){
//                return circleStartIndex;
//            }
//        }
//
//        return -1;
//    }
}
