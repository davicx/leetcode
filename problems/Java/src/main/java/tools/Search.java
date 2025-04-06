package tools;

public class Search {

    public static int binarySearch(int[] nums, int target) {
        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        int leftPointerValue = nums[leftPointer];
        int rightPointerValue = nums[rightPointer];

        while (leftPointer <= rightPointer) {
            int middleIndex = (leftPointer + rightPointer) / 2;
            int middleValue = nums[middleIndex];

            System.out.println(" ");
            System.out.println("Left Val " + nums[leftPointer] + "Right Val " + nums[rightPointer] + "middle Index " + middleIndex + " Middle Value: " + nums[middleIndex]);

            if(target == middleValue) {
                System.out.println("FOUND target " + target + " at value " + middleValue);
                return middleIndex;

            } else if(target < middleValue) {
                rightPointer = middleIndex  - 1;

                System.out.println("target " + target + " is less then middleValue " + middleValue);
            } else {
                System.out.println("target " + target +  " is Greater then middleValue " + middleValue);
                leftPointer = middleIndex + 1;
            }
        }

        System.out.println(" ");

        return -1;
    }
}
