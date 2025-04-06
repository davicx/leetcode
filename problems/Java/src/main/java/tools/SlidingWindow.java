package tools;

import java.util.ArrayList;

public class SlidingWindow {
    public static void main(String[] args) {
        Integer windowSize = 3;
        ArrayList<String> letters = new ArrayList<String>();

        letters.add("a");
        letters.add("b");
        letters.add("c");
        letters.add("d");
        letters.add("e");
        letters.add("f");
        letters.add("g");

        //slidingWindow(letters, windowSize);
        simpleSlidingWindow(letters, windowSize);

    }

    public static void simpleSlidingWindow(ArrayList<String> letters, Integer windowSize) {

        for (int i = 0; i <= letters.size() - windowSize; i++) {
            int leftWindow = i;
            int rightWindow = leftWindow + windowSize -1;

            for (leftWindow = i; leftWindow <= rightWindow; leftWindow++) {
                System.out.print(letters.get(leftWindow));
            }
            //System.out.println(letters.get(i));
            System.out.println(" ");
        }

        /*
        for (leftWindow = 0; leftWindow <= letters.size() - k; leftWindow++) {
            String currentWindowString = getWindowString(letters, leftWindow, rightWindow);
            newChar = letters.get(rightWindow);
            if(leftWindow > 0) {
                previousChar = letters.get(leftWindow - 1);
            }

            System.out.println(currentWindowString + " || previousChar: " + previousChar + " newChar: " + newChar);

            rightWindow = rightWindow + 1;

        }

         */

    }

    public static void slidingWindow(ArrayList<String> letters, Integer k) {
        int leftWindow = 0;
        int rightWindow = leftWindow + k -1;
        String previousChar = "N/A";
        String newChar = "";

        for (leftWindow = 0; leftWindow <= letters.size() - k; leftWindow++) {
            String currentWindowString = getWindowString(letters, leftWindow, rightWindow);
            newChar = letters.get(rightWindow);
            if(leftWindow > 0) {
                previousChar = letters.get(leftWindow - 1);
            }

            System.out.println(currentWindowString + " || previousChar: " + previousChar + " newChar: " + newChar);

            rightWindow = rightWindow + 1;

        }

    }

    public static String getWindowString(ArrayList<String> letters, Integer leftWindow, Integer rightWindow) {
        String currentString = "";
        for (int i = leftWindow; i <= rightWindow; i++) {
            //System.out.println(letters.get(i));
            currentString = currentString + letters.get(i);
        }

        return currentString;

    }


}
