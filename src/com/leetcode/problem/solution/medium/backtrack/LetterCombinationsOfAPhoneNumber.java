package com.leetcode.problem.solution.medium.backtrack;

import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    public static List<String> letterCombinations(String digits) {

        LinkedList<String> ans =new LinkedList<>();
        if(digits.isEmpty()) return ans;
        ans.add("");
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        for(int i =0;i<digits.length();i++){
            int index = Character.getNumericValue(digits.charAt(i));
            while (ans.peek().length()==i){
                String t = ans.remove();
                for(char s : mapping[index].toCharArray())
                    ans.add(t+s);

            }
        }

        return ans;
    }

}
