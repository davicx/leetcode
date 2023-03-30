package leetcode;

import java.util.*;

//SOLVED
public class TopKFrequentElements {
    public static void main(String[] args) {
        int k = 2;
        int[] nums = { 1,1,1,2,2,3,4,4,4,4,5,7,7,7 };

        int[] answerArray = topKFrequent(nums, k);
        for(int answer : answerArray) {
            System.out.println(answer);
        }

    }

    public static int[] topKFrequent(int[] nums, int k) {
        int[] answer = new int[k];

        if(nums.length == 1) {
            return nums;
        }
        
        Map<Integer, Integer> mapCount = new HashMap<>();
        int maxOne = 0;
        int maxTwo = 0;

        for(Integer number : nums) {
            mapCount.put(number, mapCount.getOrDefault(number, 0) + 1);
        }

        //Create Array of Items
        ArrayList<Num> numList = new ArrayList<Num>();

        mapCount.entrySet().forEach(entry->{
            String numIdentifier = "number" + entry.getKey();
            numList.add(new Num(numIdentifier, entry.getValue()));
        });

        //Priority Queue
        PriorityQueue<Num> numQueue = new PriorityQueue<>(new CompareCount());

        mapCount.entrySet().forEach(entry->{
            String numIdentifier = "number" + entry.getKey();
            numQueue.add(new Num(numIdentifier, entry.getValue()));
        });

        //Print out not in Order
        for (int i = 0; i < numQueue.size(); i++) {
            System.out.println(numList.get(i).numIdentifier + " " + numList.get(i).numCount);
        }

        System.out.println("");

        //Poll them
        for (int i = 0; i < k; i++) {
            String currentNumString = numQueue.poll().numIdentifier;
            //System.out.println(currentNumString);
            String[] currentNumArray = currentNumString.split("number");
            System.out.println(currentNumString + " " + currentNumArray[1]);
            int num = Integer.parseInt(currentNumArray[1]);
            answer[i] = num;
        }
        System.out.println("");

        return answer;
    }



}

class Num implements Comparable<Num>{
    public String numIdentifier;
    public Integer numCount;

    //Constructor
    public Num(String numIdentifier, Integer numCount) {
        this.numIdentifier = numIdentifier;
        this.numCount = numCount;
    }

    @Override
    public int compareTo(Num o) {
        return 0;
    }
}

class CompareCount implements Comparator<Num> {

    @Override
    public int compare(Num u1, Num u2) {
        if(u1.numCount < u2.numCount) {
            return 1;
        } else if (u1.numCount > u2.numCount) {
            return -1;
        } else {
            return 0;
        }
    }
}

