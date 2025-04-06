package leetcode;

import java.util.ArrayList;
import java.util.List;

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        //int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int[] nums = {1,1,1,0,0,0,1,1,1,1};
        int k = 2;

        int answer = longestOnes(nums, k);

        System.out.println("Answer: " + answer);

    }

    public static int longestOnes(int[] nums, int k) {
        ArrayList<Integer> numsMap = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {


        }


        return 1;

    }
}

class NumHolder {
    private Integer number;
    private Integer count;

    public NumHolder(Integer number, Integer count) {
        this.number = number;
        this.count = count;
    }
}
