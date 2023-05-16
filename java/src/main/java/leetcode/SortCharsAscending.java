package leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SortCharsAscending {
    public static void main(String[] args) {
        ArrayList<String> chars = new ArrayList<>();
        chars.add("H");
        chars.add("B");
        chars.add("M");
        chars.add("A");
        chars.add("N");
        chars.add("L");

        chars.sort(Comparator.naturalOrder());
        System.out.println(chars);

        chars.sort(Comparator.reverseOrder());
        System.out.println(chars);


        //ArrayList<String> answer = sortCharsAscending(chars);
        //System.out.println(answer);


    }

    public static ArrayList<String> sortCharsAscending(ArrayList<String> chars) {
        ArrayList<String> answer = new ArrayList<>();
        PriorityQueue<String> charQueue = new PriorityQueue<>();

        for (String c : chars) {
            //System.out.println(c);
            charQueue.add(c);
        }

        Integer size = charQueue.size();

        for (int i = 0; i < size; i++) {
            String currentChar = charQueue.poll();
            System.out.println(currentChar);
            //System.out.println(charQueue.poll());
            answer.add(currentChar);
        }

        return answer;
    }


}
