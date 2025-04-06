package tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
//import static tools.Tools.swapElements;

public class Tools {

    //ARRAYS
    public static void swapElements(int[] nums, int leftPosition, int rightPosition) {
        int temp = nums[leftPosition];
        nums[leftPosition] = nums[rightPosition];
        nums[rightPosition] = temp;
    }

    public static ArrayList<Integer> swapArrayListElements(ArrayList<Integer> nums, Integer leftPosition, Integer rightPosition) {
        Integer leftValue = nums.get(leftPosition);
        Integer rightValue = nums.get(rightPosition);

        nums.set(leftPosition, rightValue);
        nums.set(rightPosition, leftValue);


        return nums;
    }



    public static int[] extractArray(int[] nums, int leftPosition, int rightPosition) {
        // Out-of-bounds checks
        if (leftPosition < 0 || leftPosition >= nums.length) {
            System.out.println("Error: Left pointer is out of bounds.");
            return new int[0];
        }

        if (rightPosition < 0 || rightPosition >= nums.length) {
            System.out.println("Error: Right pointer is out of bounds.");
            return new int[0];
        }

        if (leftPosition > rightPosition) {
            System.out.println("Error: Left pointer cannot be greater than right pointer.");
            return new int[0];
        }

        // Extracting the subarray
        int[] newArray = Arrays.copyOfRange(nums, leftPosition, rightPosition + 1);

        // Printing the result
        System.out.println(Arrays.toString(newArray));

        return newArray;
    }

    //PRINTING
    public static void printStringArray(String[] input) {
        System.out.print("[ ");
        for(int i = 0; i < input.length; i++) {
            if(i < input.length - 1) {
                System.out.print(input[i] + ", ");
            } else {
                System.out.print(input[i]);
            }

        }
        System.out.print("]");
    }

    public static void printIntArray(int[] input) {
        System.out.print("[");
        for(int i = 0; i < input.length; i++) {
            if(i < input.length - 1) {
                System.out.print(input[i] + ", ");
            } else {
                System.out.print(input[i]);
            }
        }
        System.out.print(" ]");
    }

    //DATA SORTING
    public static Set<Character> stringToCharSet(String input) {
        Set<Character> charSet = new HashSet<>();

        // Only add characters if we have less than 6
        for (int i = 0; i < input.length(); i++) {
            charSet.add(input.charAt(i));
        }

        return charSet;
    }

    // Function to create a Set of single-letter Strings
    public static Set<String> stringToStringSet(String input) {
        Set<String> stringSet = new HashSet<>();

        // Only add characters if we have less than 6
        for (int i = 0; i < input.length(); i++) {
            stringSet.add(String.valueOf(input.charAt(i)));
        }

        return stringSet;
    }
    /*
        public static <T> Set<T> arrayListToSet(List<T> arrayList) {
            return new HashSet<>(arrayList);
        }
        public static <T> Set<T> arrayToSet(T[] array) {
            Set<T> set = new HashSet<>();
            for (T item : array) {
                set.add(item);
            }
            return set;
        }
     */


    //TIME
    public static void pause(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore the interrupted status
            System.err.println("Pause interrupted: " + e.getMessage());
        }
    }

    //CREATE SETS
    public static Set<Character> getVowels() {
        Set<Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        return vowels;
    }

    //FORMATTING AND REGEX
    public static String cleanSpaces(String s) {
        s = s.trim();
        s = s.replaceAll("\\s+", " ");

        return s;
    }


}

