package leetcode;


//STATUS: Done and Accepted
public class MaximumAverageSubarray {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};

        //int[] nums = {4,2,1,3,3};
        //int[] nums = {2,2,2,2,2,2};
        int k = 4;

        double answer = findMaxAverage(nums, k);
        System.out.println(" ");
        System.out.println("Answer: " + answer);
    }

    public static double findMaxAverage(int[] nums, int k) {
        double currentSum = sum(nums, 0, k);
        double maxSum = currentSum;

        int rightWindow = k;

        for (int leftWindow = 1; leftWindow <= nums.length - k; leftWindow++) {
            double previousNum = nums[leftWindow - 1];
            double newNum = nums[rightWindow];

            System.out.println(previousNum + " " + newNum);

            currentSum = currentSum + newNum - previousNum;

            rightWindow = rightWindow + 1;
            maxSum = Math.max(maxSum, currentSum);

        }

        return  (double) maxSum / k;

    }

    public static double sum(int[] nums, int start, int end) {
        double sum = 0;
        for (int i = start; i < end; i++) {
            sum += nums[i];
        }

        return sum;
    }

    public static double averageRange(int[] nums, int start, int end) {
        int sum = 0;
        int count = end - start + 1; // Number of elements in range

        for (int i = start; i <= end; i++) {
            sum += nums[i];
        }

        return (double) sum / count; // Cast to double for accurate division
    }
}

/*
    public static double findMaxAverage(int[] nums, int k) {
        if(nums.length == k) {
            return averageRange(nums, 0, k - 1);
        }

        //First Compute
        double currentAverage = averageRange(nums, 0, k - 1);
        double maxAverage = currentAverage;
        double previousAverage = 0;

        //Averages
        int rightWindow = k;

        for (int leftWindow = 1; leftWindow <= nums.length - k; leftWindow++) {

            //Multiply Average by k
            double currentTotal = previousAverage * k;
            double leftSubtract = nums[leftWindow - 1];

            //Subtract leftWindow - 1
            currentTotal = currentTotal - leftSubtract;

            //Add k
            currentTotal = currentTotal + nums[rightWindow];

            //Divide by k
            currentAverage = (double) currentTotal  / k;
            previousAverage = currentAverage;

            maxAverage = Math.max(maxAverage, currentAverage);

            rightWindow = rightWindow + 1;
        }

        return maxAverage;
    }
 */

//System.out.println(nums[leftWindow] + " " + nums[rightWindow]);
