package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


//STATUS: Done and Accepted
public class FindtheDifferenceofTwoArrays {
    public static void main(String[] args) {
        //int[] nums1 = {1,2,3};
        //int[] nums2 = {2,4,6};
        int[] nums1 = {1,2,3,3};
        int[] nums2 = {1,1,2,2};

        List<List<Integer>> answer = findDifference(nums1, nums2);
        System.out.println(answer);
    }


    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();

        Set<Integer> num1Set = arrayToSet(nums1);
        Set<Integer> num2Set = arrayToSet(nums2);
        Set<Integer> overlapSet = new HashSet<Integer>();

        //STEP 1: Find overlap
        for (Integer num : num1Set) {
            if(num2Set.contains(num)) {
                overlapSet.add(num);
            }
        }

        //STEP 2: Filter Set 1
        num1Set.removeAll(overlapSet);

        //STEP 3: Filter Set 2
        num2Set.removeAll(overlapSet);

        //STEP 4: Convert Back to Array
        List<Integer> numsOne = new ArrayList<>(num1Set);
        List<Integer> numsTwo = new ArrayList<>(num2Set);

        numsOne.removeAll(overlapSet);
        numsTwo.removeAll(overlapSet);

        answer.add(numsOne);
        answer.add(numsTwo);

        return answer;

    }

    public static List<List<Integer>> findDifferenceOriginal(int[] nums1, int[] nums2) {
        ArrayList<Integer> numsOne = new ArrayList<>();
        ArrayList<Integer> numsTwo = new ArrayList<>();
        List<List<Integer>> answer = new ArrayList<>();

        Set<Integer> num1Set = arrayToSet(nums1);
        Set<Integer> num2Set = arrayToSet(nums2);
        Set<Integer> overlapSet = new HashSet<Integer>();

        //STEP 1: Find overlap
        for (Integer num : num1Set) {
            if(num2Set.contains(num)) {
                overlapSet.add(num);
            }
        }
        System.out.println(overlapSet);

        //STEP 2: Filter Set 1
        numsOne.removeAll(overlapSet);
        for (Integer num : num1Set) {
            if(!overlapSet.contains(num)) {
                System.out.println("Add " + num + " to numsOne");
                numsOne.add(num);
            } else {
                System.out.println("DO NOT ADD " + num + " to numsOne");
            }
        }

        //STEP 3: Filter Set 2
        for (Integer num : num2Set) {
            if(!overlapSet.contains(num)) {
                System.out.println("Add " + num + " to numsTwo");
                numsTwo.add(num);
            } else {
                System.out.println("DO NOT ADD " + num + " to numsTwo");
            }
        }

        answer.add(numsOne);
        answer.add(numsTwo);

        return answer;

    }

    public static Set<Integer> arrayToSet(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int item : array) {
            set.add(item);
        }
        return set;
    }
}

//CHAT GPT
/*
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> num1Set = new HashSet<>();
        Set<Integer> num2Set = new HashSet<>();

        for (int num : nums1) num1Set.add(num);
        for (int num : nums2) num2Set.add(num);

        List<Integer> numsOne = new ArrayList<>(num1Set);
        List<Integer> numsTwo = new ArrayList<>(num2Set);

        numsOne.removeAll(num2Set);  // Removes overlapping elements from nums1
        numsTwo.removeAll(num1Set);  // Removes overlapping elements from nums2

        return List.of(numsOne, numsTwo);  // Cleaner syntax for List creation
    }
}

 */

//GROK
/*
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = arrayToSet(nums1);
        Set<Integer> set2 = arrayToSet(nums2);

        // Create copies to avoid modifying originals
        Set<Integer> onlyIn1 = new HashSet<>(set1);
        Set<Integer> onlyIn2 = new HashSet<>(set2);

        // Remove all elements present in the other set
        onlyIn1.removeAll(set2);
        onlyIn2.removeAll(set1);

        // Convert to lists for the result
        return Arrays.asList(new ArrayList<>(onlyIn1), new ArrayList<>(onlyIn2));
    }

    private Set<Integer> arrayToSet(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int item : array) {
            set.add(item);
        }
        return set;
    }
}
 */