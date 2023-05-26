package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        nums.add(30);
        nums.add(34);
        nums.add(5);
        nums.add(9);

        String answer = largestNumber(nums);
        System.out.println(answer);
    }

    public static String largestNumber(ArrayList<Integer> nums) {
        String[] stringNums = new String[nums.size()];

        //STEP 1: Create an array of Strings (converted from Integers)
        for (int i = 0; i < nums.size(); i++) {
            String numString = Integer.toString(nums.get(i));
            stringNums[i] = numString;
        }

        //STEP 2: The main logic of the program we need to compare and return based on which two numbers added together is larger
        //For example [80, 92] would become 9280 not 8092
        Arrays.sort(stringNums, (num1,num2) -> (num2 + num1).compareTo(num1 + num2));

        //STEP 3: Now that the data is sorted we can create a string with the answer
        StringBuilder myStringBuilder = new StringBuilder();

        for(String string : stringNums) {
            //System.out.println(string);
            myStringBuilder.append(string);
        }

        String answer = myStringBuilder.toString();

        //STEP 4: Return the answer if it does not start with a leading 0
        if(answer.startsWith("0")) {
            return "0";
        } else {
            return answer;
        }
    }
}
