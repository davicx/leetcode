package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};

        boolean answer = uniqueOccurrences(arr);
        System.out.println(" ");
        System.out.println("Answer: " + answer);
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occurrenceMap = new HashMap<>();
        Set<Integer> occurrenceSet = new HashSet<>();

        for (Integer currentNum : arr) {
            occurrenceMap.put(currentNum, occurrenceMap.getOrDefault(currentNum, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : occurrenceMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            int currentCount = entry.getValue();

            if (occurrenceSet.contains(currentCount)) {
                return false;
            } else {
                occurrenceSet.add(currentCount);
            }
        }
        
        return true;
    }

}
