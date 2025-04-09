package leetcode;

//STATUS: Done and Accepted
public class IsSubsequence {
    public static void main(String[] args) {
        //String s = "abc";
        //String t = "ahbgdc";
       // String s = "aaaaaa";
        //String t = "bbaaaa";
        //String s = "rjufvjafbxnbgriwgokdgqdqewn";
        //String t = "mjmqqjrmzkvhxlyruonekhhofpzzslupzojfuoztvzmmqvmlhgqxehojfowtrinbatjujaxekbcydldglkbxsqbbnrkhfdnpfbuaktupfftiljwpgglkjqunvithzlzpgikixqeuimmtbiskemplcvljqgvlzvnqxgedxqnznddkiujwhdefziydtquoudzxstpjjitmiimbjfgfjikkjycwgnpdxpeppsturjwkgnifinccvqzwlbmgpdaodzptyrjjkbqmgdrftfbwgimsmjpknuqtijrsnwvtytqqvookinzmkkkrkgwafohflvuedssukjgipgmypakhlckvizmqvycvbxhlljzejcaijqnfgobuhuiahtmxfzoplmmjfxtggwwxliplntkfuxjcnzcqsaagahbbneugiocexcfpszzomumfqpaiydssmihdoewahoswhlnpctjmkyufsvjlrflfiktndubnymenlmpyrhjxfdcq";
        //String s = "b";
        //String t = "c";
        String s = "aza";
        String t = "abzba";
        Boolean answer = isSubsequence(s,t);
        System.out.println("ANSWER " + answer);

    }

    public static boolean isSubsequence(String s, String t) {
        Output currentOutput = new Output(false, t);

        //Case 1: We were given two empty strings
        if(s.length() == 0 && t.length() == 0) {
            return true;
        }

        for (int i = 0; i < s.length(); i++) {
            String searchChar = Character.toString(s.charAt(i));
            currentOutput = checkForChar(searchChar, currentOutput.remainingString);
            //System.out.println(": " + currentOutput.foundSearchChar);

            if(currentOutput.foundSearchChar == false) {
                return false;
            }
        }

        return true;
    }

    public static Output checkForChar(String searchChar, String t) {
        Output result = new Output(false, "");
        System.out.println("SEARCH Char: " + searchChar);
        System.out.println("STRING: " + t);

        for (int i = 0; i < t.length(); i++) {
            String currentLetter = Character.toString(t.charAt(i));
            //System.out.println("Comparing: searchChar " + searchChar + "| currentLetter " + currentLetter);

            //IF: The character was found
            if (currentLetter.equalsIgnoreCase(searchChar)) {
                System.out.println("IF");
                result.foundSearchChar = true;
                result.remainingString = t.substring(i + 1);
                return result;
            }
        }
        System.out.println(" ");
        return result;
    }
}

class Output {
    public Boolean foundSearchChar;
    public String  remainingString;

    public Output(Boolean foundSearchChar, String remainingString) {
        this.foundSearchChar = foundSearchChar;
        this.remainingString = remainingString;
    }
}

/*
           //Case 2: Their is not enough left in t
            if(currentOutput.remainingString.length() < s.length()) {
                System.out.println("Ran out of t");
                return false;
            }
            if (currentLetter.equalsIgnoreCase(searchChar)) {
                System.out.println("Found: searchChar " + searchChar + " at position " + i);
                System.out.println("Strings are equal (ignoring case)");
                return i;
            }
               //System.out.println("Comparing: searchChar " + searchChar + " currentLetter " + currentLetter);

if(currentPosition == -1) {
    return false;
}
System.out.println("String Check: " + i + " currentPosition: " + currentPosition+ " searchChar: " + searchChar);
System.out.println(" ");
*/
