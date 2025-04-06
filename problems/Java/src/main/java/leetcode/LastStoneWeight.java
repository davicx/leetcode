package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;


//STATUS: Done and Accepted
public class LastStoneWeight {
    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};

        /*
        int[] stoneSorted = {8,7,4,2,1,1};
        int[] stoneSorted = {8,7,4,2,1,1};
        int[] stoneSorted = {8,7,4,2,1,1};
        int[] stoneSorted = {8,7,4,2,1,1};

         */

        int answer = lastStoneWeight(stones);
        System.out.println(" ");
        System.out.println("Answer: " + answer);

    }

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> stonesStack = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < stones.length; i++) {
            stonesStack.add(stones[i]);
        }

        while (stonesStack.size() > 1) {

            //STEP 1: Pop two elements
            Integer stoneOne = stonesStack.poll();
            Integer stoneTwo = stonesStack.poll();
            System.out.println("Comparing " + stoneOne + " " + stoneTwo);

            //STEP 2: Compare and put remaining back on top
            if(stoneOne != stoneTwo) {
                int newStone = Math.max(stoneOne, stoneTwo) - Math.min(stoneOne, stoneTwo);
                stonesStack.add(newStone);
                System.out.println("Difference " + newStone);

            }
        }
        //return stonesStack.isEmpty() ? 0 : stonesStack.poll();

        if(stonesStack.isEmpty()) {
            return 0;
        } else {
            return stonesStack.poll();
        }
    }

}
