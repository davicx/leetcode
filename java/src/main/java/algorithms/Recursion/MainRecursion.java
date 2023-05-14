package algorithms.Recursion;

import leetcode.Main;

import java.util.ArrayList;

public class MainRecursion {
    public static void main(String[] args) {
        Integer subtract = 5;
        MyCurrentValue tryMe = new MyCurrentValue(subtract, "hello");
        //Integer answer = subtract(5);
        MyCurrentValue current = subtractClass(tryMe);
        current.messages.forEach(message->System.out.println(message));

    }

    public static Integer subtract(Integer i) {
        if(i > 0) {
            System.out.println("Still going " + i);
            i = i -1;
            return subtract(i);
        } else {
            System.out.println("Base Case " + i);
            return i;
        }
    }

    public static MyCurrentValue subtractClass(MyCurrentValue currentValue) {
        if(currentValue.number > 0) {
            //System.out.println("Still going " + currentValue.number );
            currentValue.number  = currentValue.number  -1;
            currentValue.messages.add("Still going " + currentValue.number);
            return subtractClass(currentValue);
        } else {
            currentValue.messages.add("Base Case " + currentValue.number);
            return currentValue;
        }
    }

    static class MyCurrentValue {
        private Integer number;
        private String value;
        private ArrayList<String> messages;

        public MyCurrentValue(Integer number, String value) {
            this.number = number;
            this.value = value;
            this.messages = new ArrayList<>();
        }
    }
}


/*

        public static Integer learning(Integer i, Integer addMe) {
        Integer addInside = 0;
        System.out.println(addInside);
        if(i > 0) {
            addMe++;
            addInside = addInside + addMe + 5;
            System.out.println(i + " addMe: " + addMe + " addInside: " + addInside);
            System.out.println();
            i = i -1;
            return learning(i, addMe);
        } else {
            return i;
        }

 */