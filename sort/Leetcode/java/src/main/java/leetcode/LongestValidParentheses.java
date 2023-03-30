package leetcode;

public class LongestValidParentheses {

    public static void main(String[] args) {
        String s = "(()";
        isValid(s);

    }

    public static boolean isValid(String s) {
        boolean answer = true;

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }

        return answer;

    }

}
