package leetcode;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "abcde";
        String word2 = "pqr";

        System.out.println("hi");
        String answer = mergeAlternately(word1, word2);
        System.out.println(answer);
    }

    public static String mergeAlternately(String word1, String word2) {
        Integer loopSize = Math.max(word1.length(), word2.length());
        String answer = "";
        String firstLetter = "";
        String secondLetter = "";

        for (int i = 0; i < loopSize; i++) {

            if(i < word1.length()) {
                firstLetter = Character.toString(word1.charAt(i));
            } else {
                firstLetter = "";
            }

            if(i < word2.length()) {
                secondLetter = Character.toString(word2.charAt(i));
            } else {
                secondLetter = "";
            }

            answer = answer + firstLetter;
            answer = answer + secondLetter;

        }

        return answer;
    }


}
