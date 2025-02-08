package leetcode;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println("hi");
        String s = "abc";
        String t = "ahbgdc";
        Boolean answer = isSubsequence(s,t);
        System.out.println(answer);

    }

    public static boolean isSubsequence(String s, String t) {
        Integer currentPosition = 0;
        for (int i = 0; i < s.length(); i++) {
            String searchChar = Character.toString(s.charAt(i));
            System.out.println(s.charAt(i));

            currentPosition = checkForChar(t, searchChar, currentPosition);

            if(currentPosition == -1) {
                return false;
            }
        }

        return true;
    }

    public static Integer checkForChar(String t, String searchChar, Integer currentPosition) {
        Integer positionFound = -1;

        for (int i = currentPosition; i < t.length(); i++) {
            String currentLetter = Character.toString(t.charAt(i));
            System.out.println("Comparing: searchChar " + searchChar + " currentLetter " + currentLetter);

            if (currentLetter.equalsIgnoreCase(searchChar)) {
                System.out.println("Strings are equal (ignoring case)");
                return i;
            }
        }

        return -1;
    }



}
