package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagagram";
        Boolean answer = isAnagram(s, t);
        System.out.println(answer);

    }

    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        if(s.length() != t.length()) {
            return false;
        }

        //Create S and T Maps
        for (int i = 0; i < s.length(); i++) {
            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0)+ 1);
        }

        for (int i = 0; i < t.length(); i++) {
            mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0)+ 1);
        }

        //Check for equality
        if(mapS.equals(mapT)) {
            return true;
        } else {
            return false;
        }
    }

}
