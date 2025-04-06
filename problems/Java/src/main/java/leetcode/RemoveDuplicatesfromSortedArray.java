package leetcode;

import static tools.Tools.swapElements;
import static tools.Tools.printIntArray;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        //int[] nums = {1,2,2};
        int[] nums = {1,2,2,2,3,4};
        //int[] nums = {1,2,3,4,5};

        int[] answer = removeDuplicates(nums);
        System.out.println("Start ");
        printIntArray(nums);
        System.out.println("Answer ");
        printIntArray(nums);

    }

    public static int[] removeDuplicates(int[] nums) {
        int leftPointer = 0;
        int rightPointer = 1;

        if(nums.length < 2) {
            return nums;
        }

        for (int i = 0; i < nums.length - 1; i++) {

            if(nums[leftPointer] > nums[rightPointer]) {
                break;
            }

            while(nums[leftPointer] == nums[rightPointer]) {
                System.out.println("Same " + nums[leftPointer] + " " + nums[rightPointer]);
                moveElementToEndOfArray(nums, rightPointer);

                if(nums[leftPointer] == nums[rightPointer]) {
                    break;
                }
            }

            System.out.println("NO " + nums[leftPointer] + " " + nums[rightPointer]);
            leftPointer = leftPointer + 1;
            rightPointer = rightPointer + 1;

        }

        return nums;
    }


    //Move 2
    public static int[] moveElementToEndOfArray(int[] nums, int position) {
        int elementToMove = nums[position];

        for (int i = position; i < nums.length - 1; i++) {
            int swapLeft = nums[i];
            int swapRight = nums[i + 1];

            nums[i] = swapRight;
            nums[i + 1] = swapLeft;

        }


        return nums;
    }



}

//swapElements(nums, 1,2);
