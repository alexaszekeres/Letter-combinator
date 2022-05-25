package com.alexaszekeres;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class DigitCombinator {

    static HashMap<Integer, String> map = new HashMap<>();

    private static void SetupCombinator(){
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");

    }

    public static List<String> getPossibleLetterCombinationsOfDigits(String digits){
        if(map.isEmpty())
            SetupCombinator();
        List<String> combinations = new LinkedList<String>();
        getCombinationsRecursive(digits, combinations, digits.length() - 1, "");
        combinations.sort(String::compareTo);
        return combinations;
    }

    private static void getCombinationsRecursive(String digits, List<String> combinations, int index, String value) {
        if(index == -1){
            combinations.add(value);
            return;
        }
        for (char c : getString(digits, index).toCharArray()) {
            getCombinationsRecursive(digits, combinations, index - 1, c + value);
        }
    }

    private static String getString(String digits, int count) {
        return map.getOrDefault(Integer.parseInt(Character.toString(digits.charAt(count))), "");
    }

}
