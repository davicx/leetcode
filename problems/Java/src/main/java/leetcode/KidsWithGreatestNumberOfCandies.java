package leetcode;

import java.util.ArrayList;
import java.util.List;


//STATUS: Done and Accepted
public class KidsWithGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        List<Boolean> answer = kidsWithCandies(candies, extraCandies);

        System.out.println("Answer: ");
        System.out.println(answer);
    }


    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> answer = new ArrayList<Boolean>();
        int maxValue = 0;

        //Get Max
        for (int i = 0; i < candies.length; i++) {
            maxValue = Math.max(maxValue, candies[i]);
        }

        //Solve Problem
        for (int i = 0; i < candies.length; i++) {
            int currentVal = candies[i];

            if(currentVal + extraCandies >= maxValue) {
                answer.add(true);
            } else {
                answer.add(false);
            }
        }

        return answer;
    }
}
