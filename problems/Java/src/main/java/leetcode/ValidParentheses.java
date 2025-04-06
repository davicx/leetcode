package leetcode;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;


//STATUS: Done and Accepted
public class ValidParentheses {
    public static void main(String[] args) {
        //String s = "()[]{}";
        String s = "){";
        //String s = "([)]";

        Boolean answer = isValid(s);
        System.out.println("Answer " + answer);
    }

    public static boolean isValid(String s) {
        Stack<String> charStack = new Stack<>();

        if (!hasEvenLength(s)) {
            System.out.println("Even length: " + s.length());
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            String currentChar = String.valueOf(s.charAt(i));

            //PUT: Put Character on Stack
            if (currentChar.equals("(") || currentChar.equals("[") || currentChar.equals("{")) {
                System.out.println("PUT ON stack " + currentChar);
                charStack.add(currentChar);

            //PULL: Get top character
            } else if (currentChar.equals(")") || currentChar.equals("]") || currentChar.equals("}")) {
                System.out.println("PULL OFF stack " + currentChar);
                if(charStack.isEmpty()) {
                    return false;
                }
                String topChar = charStack.pop();

                //CHECK 1: For (
                if(currentChar.equalsIgnoreCase(")")) {
                    System.out.println("IF Case: ( || " + topChar + " " + currentChar);

                    if(!topChar.equalsIgnoreCase("(")) {
                        return false;
                    }

                } else if (currentChar.equalsIgnoreCase("]")) {
                    System.out.println("IF Case: [ || " + topChar + " " + currentChar);
                    if(!topChar.equalsIgnoreCase("[")) {
                        return false;
                    }

                } else if (currentChar.equalsIgnoreCase("}")) {
                    System.out.println("IF Case: { || " + topChar + " " + currentChar);
                    if(!topChar.equalsIgnoreCase("{")) {
                        return false;
                    }
                }

            } else {
                System.out.println(currentChar + ": Not a bracket character");
            }

            System.out.println(" ");

        }

        System.out.println("Is stack empty? " + charStack.isEmpty());

        if(!charStack.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean hasEvenLength(String str) {
        if (str == null) return false; // Handle null case if needed
        return str.length() % 2 == 0;
    }
}


        /*
               while (!charStack.isEmpty()) {
            String currentChar = charStack.pop();

            //PUT: Put Character on Stack
            if (currentChar.equals("(") || currentChar.equals("[") || currentChar.equals("{")) {
                System.out.println("PUT ON stack " + currentChar);

            //PULL: Get top character
            } else if (currentChar.equals(")") || currentChar.equals("]") || currentChar.equals("}")) {
                System.out.println("PULL OFF stack " + currentChar);

            } else {
                System.out.println(currentChar + ": Not a bracket character");
            }

            System.out.println(" ");

        }
        if(charStack.isEmpty() && parenCount == 0 && squareCount == 0 && curlyCount ==0) {
            return true;
        } else {
            return false;
        }
        */
/*
   if (currentChar.equals("(")) {
        System.out.println(currentChar + ": Opening parenthesis");
    } else if (currentChar.equals("[")) {
        System.out.println(currentChar + ": Opening square bracket");
    } else if (currentChar.equals("{")) {
        System.out.println(currentChar + ": Opening curly brace");
    } else if (currentChar.equals(")")) {
        System.out.println(currentChar + ": Closing parenthesis");
    } else if (currentChar.equals("]")) {
        System.out.println(currentChar + ": Closing square bracket");
    } else if (currentChar.equals("}")) {
        System.out.println(currentChar + ": Closing curly brace");
    } else {
        System.out.println(currentChar + ": Character not found in bracket set");
    }
 */