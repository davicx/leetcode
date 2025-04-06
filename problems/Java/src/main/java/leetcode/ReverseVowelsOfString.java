package leetcode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsOfString {
    public static void main(String[] args) {
        String s = "abcde";
        //String s = "IceCreAm";

        String answer = reverseVowels(s);
        System.out.println(answer);
    }



    public static String reverseVowels(String s) {
        Set<Character> vowels = getVowels();
        ArrayList<Character> vowelArray = new ArrayList<>();
        String answer = "";

        //STEP 1: Create Vowel Array
        for (int i = 0; i < s.length(); i++) {
            Character currentChar = s.charAt(i);
            if(vowels.contains(currentChar)) {
                vowelArray.add(currentChar);
            }
        }

        //STEP 2: Replace Characters
        Integer currentPosition = vowelArray.size() - 1;

        for (int i = 0; i < s.length() ; i++) {
            Character currentChar = s.charAt(i);

            System.out.println(currentChar);

            //Swap Vowel
            if(vowels.contains(currentChar)) {
                answer = answer + vowelArray.get(currentPosition);
                currentPosition = currentPosition - 1;
            } else {
                answer = answer + currentChar;
            }

        }

        return answer;
    }



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

    public static String reverseVowelsWithPointers(String s) {
        Set<Character> vowels = getVowels(); // Get set of vowels for quick lookup
        char[] characters = s.toCharArray(); // Convert string to character array for modification
        int left = 0; // Pointer starting from the beginning
        int right = s.length() - 1; // Pointer starting from the end

        // Loop until the two pointers cross each other
        while (left < right) {
            // Move left pointer forward until it finds a vowel
            while (left < right && !vowels.contains(characters[left])) {
                left++;
            }

            // Move right pointer backward until it finds a vowel
            while (left < right && !vowels.contains(characters[right])) {
                right--;
            }

            // Swap vowels at left and right pointers
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;

            // Move both pointers inward
            left++;
            right--;
        }

        // Convert character array back to string
        return new String(characters);
    }



}


/*

    public static String reverseVowels(String s) {
        Set<Character> vowels = getVowels(); // Get set of vowels for quick lookup
        char[] characters = s.toCharArray(); // Convert string to character array for modification
        int left = 0; // Pointer starting from the beginning
        int right = s.length() - 1; // Pointer starting from the end

        // Loop until the two pointers cross each other
        while (left < right) {
            // Move left pointer forward until it finds a vowel
            while (left < right && !vowels.contains(characters[left])) {
                left++;
            }

            // Move right pointer backward until it finds a vowel
            while (left < right && !vowels.contains(characters[right])) {
                right--;
            }

            // Swap vowels at left and right pointers
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;

            // Move both pointers inward
            left++;
            right--;
        }

        // Convert character array back to string
        return new String(characters);
    }

    public static Set<Character> getVowels() {
        return new HashSet<>(Arrays.asList(
            'a', 'e', 'i', 'o', 'u',
            'A', 'E', 'I', 'O', 'U'
        ));
    }
 */