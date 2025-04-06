package tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountWords {
    public static void main(String[] args) {
        System.out.println("hi");
        String s = "hi there!";
        countWords(s);

    }


    public static Map<String, Integer> countWords(String s) {
        //Hash Map with Default Count
        String[] words = {"one", "two", "two", "three", "three", "three"};

        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        wordMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
        return wordMap;
    }

}