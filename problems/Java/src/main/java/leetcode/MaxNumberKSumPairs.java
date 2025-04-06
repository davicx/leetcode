package leetcode;

import java.util.Arrays;

public class MaxNumberKSumPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int k = 5;

        int answer = maxOperations(nums, k);

        //System.out.println("Answer: " + answer);
        System.out.println(Arrays.toString(nums));
        nums = remove(nums, 0);
        System.out.println(Arrays.toString(nums));

    }

    public static int maxOperations(int[] nums, int k) {
        int answer = 0;
        //array = ArrayUtils.removeElement(array, element)

        for (int i = 0; i < nums.length; i++) {


        }

        return answer;

    }

    //System.out.println(Arrays.toString(arr));

    public static int[] remove(int[] arr, int in) {

        if (arr == null || in < 0 || in >= arr.length) {
            return arr;
        }

        int[] arr2 = new int[arr.length - 1];

        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == in)
                continue;

            arr2[k++] = arr[i];
        }

        return arr2;
    }
}
