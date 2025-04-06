package leetcode;

import java.util.Arrays;

import static tools.Tools.extractArray;

public class SearchInsertPosition {
    public static void main(String[] args) {
        //int[] nums = {1,2,5,8,10,12,14,15};
        int[] nums = {1,2,5,8,10};
        //int[] nums = {8,9,10};
        //int[] nums = {8};
        int target = 7;
        int answer = searchInsert(nums, target);

        System.out.println("Answer: " + answer);

    }

    public static int searchInsert(int[] nums, int target) {
        int answer = 0;
        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        int leftPointerValue = nums[leftPointer];
        int rightPointerValue = nums[rightPointer];
        int currentLoop = 0;

        if(target < nums[0]) {
            return 0;
        }

        if(target > nums[nums.length - 1]) {
            return nums.length;
        }

        while (leftPointer <= rightPointer) {
            int middleIndex = (leftPointer + rightPointer) / 2;
            int middleValue = nums[middleIndex];

            extractArray(nums, leftPointer, rightPointer);
            System.out.println("leftPointer " + leftPointer + "||  rightPointer " + rightPointer);
            System.out.println(" ");

            if(target == middleValue) {
                return middleIndex;

            } else if(target < middleValue) {
                rightPointer = middleIndex  - 1;
                answer = middleIndex;

                } else {
                leftPointer = middleIndex + 1;
                answer = middleIndex + 1;

            }

            currentLoop = currentLoop + 1;

        }

        System.out.println("LAST LOOP ");

        //System.out.println("LAST LOOP " + leftPointer + " " + rightPointer);
        //System.out.println(nums[leftPointer] + " " + nums[rightPointer]);

        return answer;
    }


/*
Condition Check: In addition to checking if the target is found, you'll also need to track the position where it should be inserted. Think about how you can modify your binary search to return that position.

Boundary Handling: If the target is smaller than all elements, it should be inserted at index 0. If it's greater than all elements, it should be inserted at the end. Consider how your logic can naturally account for this.

Tracking Midpoint: As you narrow your search window, pay attention to the mid index — it will often point to the correct insert position when the search concludes.
If target is less than nums[mid], the insert position should likely be mid.
If target is greater than nums[mid], the insert position should be mid + 1
 */

}


//WORKS BINARY

/*
    public static int searchInsert(int[] nums, int target) {
        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        int leftPointerValue = nums[leftPointer];
        int rightPointerValue = nums[rightPointer];
        int answerIndex = -1;
        int currentLoop = 0;


        while (leftPointer <= rightPointer) {
            int middleIndex = (leftPointer + rightPointer) / 2;
            int middleValue = nums[middleIndex];

            //System.out.println("CURRENT LOOP " + currentLoop);
            extractArray(nums, leftPointer, rightPointer);

            //System.out.println(" ");
            //System.out.println("Left Val " + nums[leftPointer] + " Right Val " + nums[rightPointer] + " middle Index " + middleIndex + " Middle Value: " + nums[middleIndex]);

            if(target == middleValue) {
                //System.out.println("FOUND: Left " + nums[leftPointer] + " Right " + nums[rightPointer] + " middle Index " + middleIndex + " Middle Value: " + nums[middleIndex]);

                return middleIndex;

            } else if(target < middleValue) {
                rightPointer = middleIndex  - 1;
                //System.out.println("LESS: Left " + nums[leftPointer] + "Index: ["+ leftPointer+"]" + " Right " + nums[rightPointer] + " Index: ["+ rightPointer+"]");
                //System.out.println("Middle Value: " + middleValue + " Index: ["+ middleIndex+"]" + " Searching for " + target);

                //answerIndex = leftPointer;
                //answerIndex = middleIndex;

                //System.out.println("target " + target + " is less then middleValue " + middleValue);
            } else {
                //System.out.println("GREATER: Left Val " + nums[leftPointer] + " Right Val " + nums[rightPointer] + " middle Index " + middleIndex + " Middle Value: " + nums[middleIndex]);
                //System.out.println("GREATER: Left " + nums[leftPointer] + " Index: ["+ leftPointer+"]" + " Right " + nums[rightPointer] + " Index: ["+ rightPointer+"]");
                //System.out.println("Middle Value: " + middleValue + " Index: ["+ middleIndex+"]" + " Searching for " + target);

                leftPointer = middleIndex + 1;
                //answerIndex = rightPointer;

            }

            currentLoop = currentLoop + 1;
            System.out.println(" ");


        }


        System.out.println("LAST LOOP");
        System.out.println(" Left " + leftPointer + " Right: " + rightPointer);
        //System.out.println("Middle Value: " + middleValue + " Index: ["+ middleIndex+"]" + " Searching for " + target);



        return answerIndex;
    }

 */

//NOTES
/*
public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low; // Low is the correct insert position
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        System.out.println(searchInsert(nums, target)); // Output: 2
    }
}

 */


/*
public class BinarySearch {
    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9, 11};
        int target = 5;
        System.out.println(search(nums, target)); // Output: 2
    }
}

 */