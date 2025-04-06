package leetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

import static tools.Tools.printStringArray;


//STATUS: Done and Accepted
public class RelativeRanks {
    public static void main(String[] args) {
        //int[] score = {5,4,3,2,1};
        int[] score = {10,3,8,9,4};

        String[] answer = findRelativeRanks(score);
        System.out.println(" ");
        System.out.println("Answer:");
        printStringArray(answer);

    }

    public static String[] findRelativeRanks(int[] score) {
        String[] answer = new String[score.length];
        Map<Integer, String> myMap = new HashMap<>();
        Integer position = 1;
        PriorityQueue<Integer> rankings = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < score.length; i++) {
            rankings.add(score[i]);
        }

        while (!rankings.isEmpty()) {
            String currentRanking = "";
            Integer currentPlace = rankings.poll();

            //STEP 1: Sort Position
            if(position == 1) {
                currentRanking = "Gold Medal";
            } else if (position == 2) {
                currentRanking = "Silver Medal";
            } else if (position == 3) {
                currentRanking = "Bronze Medal";
            } else {
                currentRanking = position.toString();
            }

            position = position + 1;

            //STEP 2: Add to Hashmap {ArrayValue, currentRanking} {10, gold}
            myMap.put(currentPlace, currentRanking);

        }

        //STEP 3: Loop over array and add to answer array
        for (int i = 0; i < score.length; i++) {
            String answerValue = myMap.get(score[i]);

            System.out.println(i + " " + score[i] + " " + answerValue);
            answer[i] = answerValue;
        }

        return answer;

    }
}

//Input: score = []
//Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]