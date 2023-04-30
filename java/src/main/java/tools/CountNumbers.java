package tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountNumbers {
    public static void main(String[] args) {
        System.out.println("hi");
        Integer[] nums = {1,1,1,2,2,3};
        Map<Integer, Integer> answer = countNums(nums);

    }


    public static Map<Integer, Integer> countNums(Integer[] nums ) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (Integer num : nums) {
            numMap.put(num, numMap.getOrDefault(num, 0) + 1);
        }

        numMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
        return numMap;
    }

}
