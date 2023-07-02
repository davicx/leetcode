package leetcode;

public class LongestPalindromeLength {
    public static void main(String[] args) {
        String s = "babab";
        //String s = "";
        //String s = "abba";
        Integer answer = longestPalindrome(s);
        System.out.println("ANSWER " + answer);

    }

    //public static String longestPalindrome(String s) {
    public static Integer longestPalindrome(String s) {
        Integer answer = 0;
        Integer answerSingle = 0;
        Integer answerDouble = 0;

        if(s.length() == 1) {
            return 1;
        }

        if(s.length() == 2) {
            if(s.charAt(0) == s.charAt(1)) {
                return 2;
            } else {
                return 1;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            Integer currentLongestSingle = checkSingleLetter(s,i);
            Integer currentLongestDouble = checkDoubleLetter(s,i);

            answerSingle = Math.max(answerSingle, currentLongestSingle);
            answerDouble = Math.max(answerDouble, currentLongestDouble);

        }

        answer = Math.max(answerSingle, answerDouble);

        return answer;
    }


    public static Integer checkDoubleLetter(String s, Integer start) {
        Integer currentLongest = 0;
        Integer leftPointer = start;
        Integer rightPointer = start + 1;

        //Make sure we do not go over the string length
        if(leftPointer < 0 || rightPointer > s.length() - 1) {
            return currentLongest;
        }

        //Check if the two match
        if (s.charAt(leftPointer) != s.charAt(rightPointer)) {
            return 0;
        } else {
            currentLongest = currentLongest + 2;
        }

        //Loop Outwards and Check
        for (int i = start; i < s.length(); i++) {
            leftPointer = leftPointer - 1;
            rightPointer = rightPointer + 1;

            if(leftPointer < 0 || rightPointer > s.length() - 1) {
                return currentLongest;
            }

            char leftChar = s.charAt(leftPointer);
            char rightChar = s.charAt(rightPointer);

            if(leftChar == rightChar) {
                System.out.println("found a double match ");
                currentLongest = currentLongest + 2;
            }
        }


        return currentLongest;

    }

    public static Integer checkSingleLetter(String s, Integer place) {
        Integer longestPalindrome = 1;

        //System.out.println("Checking " + s.charAt(place) + " " + place );
        Integer leftPointer = place;
        Integer rightPointer = place;

        for (int i = place; i < s.length(); i++) {
            leftPointer = leftPointer - 1;
            rightPointer = rightPointer + 1;

            if(leftPointer < 0 || rightPointer > s.length() - 1) {
                break;
            }
            char centerChar = s.charAt(i);
            char leftChar = s.charAt(leftPointer);
            char rightChar = s.charAt(rightPointer);

            if(leftChar == rightChar) {
                //System.out.println("found a match ");
                longestPalindrome = longestPalindrome + 2;
            }

            //System.out.print(leftChar + " " + centerChar + " " +  rightChar);
        }

        return longestPalindrome;
    }


}
