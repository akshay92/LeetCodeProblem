package com.leetcode.problem.solution.easy;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        System.out.println(titleToNumber("CDA"));
    }

    public static int titleToNumber(String columnTitle) {
        int result = 0;
        int count = 0;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {

            if (count == 0) {
                result = columnTitle.charAt(i) - 'A' + 1;
                count++;
            } else {
                int charValue = (int) ((columnTitle.charAt(i) - 'A' + 1) * Math.pow(26, count));
                result = result + charValue;
                count++;
            }

        }

        return result;
    }
}
