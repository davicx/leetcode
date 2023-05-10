package algorithms.Recursion;

import leetcode.Main;

public class MainRecursion {
    public static void main(String[] args) {
        Integer add = 0;
        Integer answer = subtract(5, add);
        System.out.println(answer);

    }

    public static Integer subtract(Integer i, Integer addMe) {
        Integer addInside = 0;
        System.out.println(addInside);
        if(i > 0) {
            addMe++;
            addInside = addInside + addMe + 5;
            System.out.println(i + " addMe: " + addMe + " addInside: " + addInside);
            System.out.println();
            i = i -1;
            return subtract(i, addMe);
        } else {
            return i;
        }

    }
}
