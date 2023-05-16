package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*
Notes:
1) I spent from 30 minutes finishing this up
2) I used a set for faster lookup time most likely O(1) without any collisions as opposed to O(N)
3) This could be cleaned a lot if I have extra variables like 'currentString' for readability
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

        if(inputArrays.size() == 0) {
            return inputArrays;
        }

        //STEP 1: Loop over both arrays so that we are going through things one 'Character' at a Time
        for (int i = 0; i < inputArrays.size(); i++) {
            ArrayList<String> resultSubArray = new ArrayList<>();

            for (int j = 0; j < inputArrays.get(i).size(); j++) {
                String currentString = inputArrays.get(i).get(j);

                if(currentString.length() > 1) {
                    System.out.println("Please make sure the input is only 1 letter");
                    return inputArrays;
                }

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