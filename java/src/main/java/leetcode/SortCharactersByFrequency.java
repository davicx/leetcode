package leetcode;

import java.util.*;

//SOLVED
public class SortCharactersByFrequency {
    public static void main(String[] args) {
        //String s = "tree";
        String s = "eeeee";

        frequencySort(s);
    }

    public static String frequencySort(String s) {
        Map<Character, Integer> charMap = new HashMap<>();

        //STEP 1: Add Chars to a Map
        for (int i = 0; i < s.length(); i++) {
            charMap.put(s.charAt(i), charMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        //STEP 2: Add map items to queue
        PriorityQueue<CharCount> charQueue = new PriorityQueue<>(new CompareChar());
        //ArrayList<CharCount> charQueue= new ArrayList<CharCount>();

        charMap.entrySet().forEach(entry -> {
            String charIdentifier = "" + entry.getKey();
            charQueue.add(new CharCount(charIdentifier, entry.getValue()));
        });

        //STEP 3: Pull them Out
        String answer = "";
        Integer queueSize = charQueue.size();


        for (int i = 0; i < queueSize; i++) {
            CharCount current = charQueue.poll();
            String currentChar = current.charName;
            System.out.println(currentChar + " " + current.charCount);
            for (int j = 0; j < current.charCount; j++) {
                answer = answer + currentChar;
            }
        }

        return answer;

    }
}

 class CharCount implements Comparable<CharCount>{
    public String charName;
    public Integer charCount;

    //Constructor
    public CharCount(String charName, Integer charCount) {
        this.charName = charName;
        this.charCount = charCount;
    }

    @Override
    public int compareTo(CharCount o) {
        return 0;
    }
}

class CompareChar implements Comparator<CharCount> {

    @Override
    public int compare(CharCount u1, CharCount u2) {
        if(u1.charCount < u2.charCount) {
            return 1;
        } else if (u1.charCount > u2.charCount) {
            return -1;
        } else {
            return 0;
        }
    }
}


