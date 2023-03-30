package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IntersectionTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,2,1,1,3};
        int[] nums2 = {2,2,3};

        int[] answer = intersect(nums1, nums2);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }

    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> answerList = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        //Create the Hashmap
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0)+ 1);
        }

        //Check the other Hashmap
        int currentKey;

        for (int i = 0; i < nums2.length; i++) {
            currentKey = nums2[i];
            if (map.containsKey(currentKey)) {
                int currentCount = map.get(currentKey);
                if (currentCount >= 1) {
                    answerList.add(currentKey);
                    currentCount = currentCount - 1;

                    map.replace(currentKey, currentCount);
                }
            }
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

}
