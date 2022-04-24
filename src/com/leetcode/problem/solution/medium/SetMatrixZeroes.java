package com.leetcode.problem.solution.medium;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeroes {
    public static void main(String[] args) {

    }

    public void setZeroes(int[][] matrix) {
        Set<Integer> row = new HashSet<>();
        Set<Integer> colum = new HashSet<>();

        int rowSize = matrix.length;
        int columSize = matrix[0].length;

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columSize; j++) {
                if(matrix[i][j] ==0 ){
                    row.add(i);
                    colum.add(j);
                }
            }
        }


        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columSize; j++) {
                if(row.contains(i) || colum.contains(j)){
                    matrix[i][j] =0;
                }
            }
        }


    }
}
