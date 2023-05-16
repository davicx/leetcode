package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*
Notes:
1) I spent from 5:06 to 5:27 so about 20 minutes I am going to look at it again tomorrow for errors
2) In Java Chars and Strings are different so even though these look like primitive Chars they are String Objects
3) We used a set for faster lookup time most likely O(1) without any collisions as opposed to O(2)
 */
public class RemoveDuplicateString {
    public static void main(String[] args) {

        //STEP 1: Create data similar to what was given in the Interview
        ArrayList<ArrayList<String>> listOfChars = createStarterArrays();

        //STEP 2: Run the Replace Chars Function
        ArrayList<ArrayList<String>> answer = replaceChars(listOfChars);

        System.out.println(listOfChars);
        System.out.println(answer);

    }

    public static ArrayList<ArrayList<String>> replaceChars(ArrayList<ArrayList<String>> inputArrays) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        Set<String> uniqueStringSet = new HashSet<String>();

        //STEP 1: Loop over both arrays so that we are going through things one 'Character' at a Time
        for (int i = 0; i < inputArrays.size(); i++) {
            ArrayList<String> resultSubArray = new ArrayList<>();

            for (int j = 0; j < inputArrays.get(i).size(); j++) {
                String currentString = inputArrays.get(i).get(j);

                //If the Set contains the value add empty quotes
                if(uniqueStringSet.contains(currentString)) {
                    resultSubArray.add("\"\"");
                } else {
                    resultSubArray.add(currentString);
                }
                uniqueStringSet.add(currentString);
            }
            result.add(resultSubArray);
        }

        return result;

    }


    public static ArrayList<ArrayList<String>> createStarterArrays() {
        ArrayList<ArrayList<String>> listOfChars = new ArrayList<>();
        ArrayList<String> listOne = new ArrayList<>();
        ArrayList<String> listTwo = new ArrayList<>();
        listOne.add("A");
        listOne.add("B");
        listOne.add("C");
        listOne.add("D");

        listTwo.add("A");
        listTwo.add("b");
        listTwo.add("c");
        listTwo.add("D");

        listOfChars.add(listOne);
        listOfChars.add(listTwo);

        return listOfChars;

    }
}