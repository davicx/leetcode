package leetcode;

import java.util.ArrayList;

public class PlusOne {
    public static void main(String[] args) {
        ArrayList<Integer> digits = new ArrayList<>();
        digits.add(1);
        digits.add(2);
        digits.add(3);
        //Input: digits = [1,2,3]
        //Output: [1,2,4]
        ArrayList<Integer> answer = plusOne(digits);
        System.out.println(answer);
    }

    public static ArrayList<Integer> plusOne(ArrayList<Integer> digits) {
        Integer addAmount = 1;
        Integer carry = 0;

        for (int i = digits.size() - 1; i >= 0; i--) {
            if(i < 10) {
                digits.set(i, digits.get(i) + addAmount + carry);
                carry = 0;
                addAmount = 0;
            } else {
                carry = 1;
                digits.set(i, 0);
                addAmount = 0;
            }

            System.out.println(digits.get(i));
        }


        return digits;
    }
}

/*
        System.out.println(digits);
                Integer carry = 0;

                for (int i = digits.size() - 1; i >= 0; i--) {
                Integer currentNumber = digits.get(i);
                Integer newNumber;

                if(currentNumber + carry < 9) {
        newNumber = currentNumber + 1;
        carry = 0;
        } else {
        newNumber = 0;
        carry = 1;

        }

        digits.set(i, newNumber);

        if(i == 0 && carry == 1) {
        //digits.set(i + 1, carry);
        digits.add(0, carry);
        }
        //Case: Middle or Last Number
        //Case: Less or more then 9
        //Case: Carry or no carry

        //Case 1: Middle Number
        if(i > 0) {
        //System.out.println("middle " + digits.get(i));

        //Case 2: Last Number
        } else {
        //System.out.println("last " + digits.get(i));
        }
        }




        System.out.println(digits);



        for (int i = digits.size() - 1; i >= 0; i--) {
            System.out.println(digits.get(i));

            if(i < 10) {
                digits.set(i, digits.get(i) + 1);
            } else {
                carry = 1;
                digits.set(i, 0);
            }

        }

         */

