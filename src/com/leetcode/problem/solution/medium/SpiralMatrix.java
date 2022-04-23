package com.leetcode.problem.solution.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length-1;
        int left = 0 ;
        int right = matrix[0].length-1;

        while (true){

            //right
            for(int i =left;i<=right;i++)result.add(matrix[top][i]);
            top++;

            if(top > bottom){
                break;
            }

            // bottom
            for(int i =top;i<=bottom;i++)result.add(matrix[i][right]);
            right--;

            if(left > right){
                break;
            }

            // left
            for(int i =right;i>=left;i--)result.add(matrix[bottom][i]);
            bottom--;

            if(top>bottom){
                break;
            }

            // top
            for(int i =bottom;i>=top;i--)result.add(matrix[i][left]);
            left++;

            if(left>right){
                break;
            }

        }

        return result;
    }
}
