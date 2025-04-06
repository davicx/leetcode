package leetcode;

import com.sun.security.jgss.GSSUtil;

import java.util.HashSet;
import java.util.Set;


//STATUS: Done and Accepted
public class MaximumNumberOfVowelsInSubstringOGivenLength {
    public static void main(String[] args) {
        String s = "abciiidef";
        //String s = "abcde";
        int k = 3;
        //String s = "weallloveyou";
        //int k = 7;

        int answer = maxVowels(s,k);
        System.out.println(" ");
        System.out.println("ANSWER " + answer);
    }

    public static int maxVowels(String s, int k) {
        Set<Character> vowels = getVowels();
        int maxVowels = 0;
        int currentWindowCount = 0;

        for (int i = 0; i <= s.length() - k; i++) {

            //First Count
            if(i == 0) {
                String substring = s.substring(i, i + k);
                System.out.println("First loop | " + substring);

                currentWindowCount = countInitialVowels(substring);
                maxVowels = Math.max(maxVowels, currentWindowCount);

                System.out.println(substring + " | " + currentWindowCount);
                System.out.println(" ");

            //Last Loop
            } else if (i == s.length() - k){
                String substring = s.substring(i, i + k);
                Character prevChar = s.charAt(i - 1);
                Character newChar = s.charAt(i + k - 1);

                int previousCharCount = getPreviousCharCount(vowels, s, i);
                int newCharCount = getNextCharCount(vowels, newChar);

                currentWindowCount = currentWindowCount + newCharCount - previousCharCount;
                maxVowels = Math.max(maxVowels, currentWindowCount);

                System.out.println("Last loop | " + substring);
                System.out.println("currentWindowCount  " + currentWindowCount + " || " + prevChar + " " + previousCharCount + " | " + newChar + " " + newCharCount);

                System.out.println(" ");

            //Middle Loops
            } else {
                String substring = s.substring(i, i + k);
                Character prevChar = s.charAt(i - 1);
                Character newChar = s.charAt(i + k - 1);

                int previousCharCount = getPreviousCharCount(vowels, s, i);
                int newCharCount = getNextCharCount(vowels, newChar);

                currentWindowCount = currentWindowCount + newCharCount - previousCharCount;
                maxVowels = Math.max(maxVowels, currentWindowCount);


                System.out.println("Middle | " + substring);
                System.out.println("currentWindowCount  " + currentWindowCount + " || " + prevChar + " " + previousCharCount + " | " + newChar + " " + newCharCount);

                System.out.println(" ");

            }
        }

        return maxVowels;
    }


    public static int getPreviousCharCount(Set<Character> vowels, String s, Integer i) {
        if(i - 1 >= 0) {
            Character prevChar = s.charAt(i - 1);
            //System.out.println("the previous Character is " + s.charAt(i-1));

            if(vowels.contains(prevChar)) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }

    }

    public static int getNextCharCount(Set<Character> vowels, Character newChar) {
        if(vowels.contains(newChar)) {
            return 1;
        } else {
            return 0;
        }
    }


    public static int countInitialVowels(String substring) {
        Set<Character> vowels = getVowels();
        int vowelCount = 0;

        for (int i = 0; i < substring.length(); i++) {
            Character currentChar = substring.charAt(i);
            if(vowels.contains(currentChar)) {
                vowelCount = vowelCount + 1;
            }
        }

        return vowelCount;
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

    //LEETCODE
    public int maxVowelsChat(String s, int k) {
        Set<Character> vowels = getVowels();
        int maxVowels = 0, currentWindowCount = 0;

        // Count vowels in the first window
        for (int i = 0; i < k; i++) {
            currentWindowCount += vowels.contains(s.charAt(i)) ? 1 : 0;
        }
        maxVowels = currentWindowCount;

        // Slide the window through the string
        for (int i = k; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) currentWindowCount++;
            if (vowels.contains(s.charAt(i - k))) currentWindowCount--;
            maxVowels = Math.max(maxVowels, currentWindowCount);
        }

        return maxVowels;
    }

    private Set<Character> getVowelsChat() {
        return Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
    }



}
