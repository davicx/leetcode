package leetcode;

import learning.User;

import java.util.*;

//WORKS

public class TopFrequentElements {
    public static void main(String[] args) {
        int k = 2;
        int[] nums = { 1,1,1,2,2,3,4,4,4,4,5,7,7,7 };
        //Input:  = [], k = 2
        //Output: [1,2]

        //topKFrequent(nums, k);


    }
/*
    public static int[] topKFrequent(int[] nums, int k) {
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
        for (int i = 0; i < numQueue.size(); i++) {
            System.out.println(numQueue.poll().numIdentifier);
        }
        System.out.println("");

        return nums;
    }


    public static int[] longAnswer(int[] nums, int k) {
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
        for (int i = 0; i < numQueue.size(); i++) {
            System.out.println(numQueue.poll().numIdentifier);
        }
        System.out.println("");



        return nums;
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

 */
}

