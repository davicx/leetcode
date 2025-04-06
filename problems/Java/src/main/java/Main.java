import java.util.*;

public class Main {
    public static void main(String[] args) {

        loops();

    }


    //LOOPS
    //For Loop
    //While Loop


    //DATA STRUCTURES
    //Arrays
    //Hashmap

    public static void dataStructures() {

        //STRINGS
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "hello";

        boolean isEqual1 = str1.equals(str2);
        boolean isEqual3 = str1.equalsIgnoreCase(str3);

        //ARRAY
        int[] myArray = new int[3];

        ArrayList<String> users = new ArrayList<String>();
        users.add("Sam");
        users.add("Davey");
        users.add("Frodo");

        //HASHMAP
        int[] nums = {2, 7, 11, 15};
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            myMap.put(nums[i], i);
        }

        myMap.entrySet().forEach(entry->{
            //System.out.println(entry.getKey() + " " + entry.getValue());
        });


        //SET
        Set<Integer> mySet = new HashSet<Integer>();
        //num1Set.removeAll(overlapSet);

        //STACK
        Stack<String> stack = new Stack<>();

        // 1. Push operation - adding elements to the stack
        System.out.println("Pushing elements:");
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        stack.push("Dragon Fruit");
        System.out.println("Stack after pushes: " + stack);

        // 2. Peek operation - view top element without removing it
        String topElement = stack.peek();
        System.out.println("Top element (peek): " + topElement);
        System.out.println("Stack after peek: " + stack);

        // 3. Pop operation - remove and return top element
        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after pop: " + stack);

        // 4. Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // 5. Get size of stack
        System.out.println("Stack size: " + stack.size());

        // 6. Search operation - find position from top (1-based index)
        int position = stack.search("Banana");
        System.out.println("Position of 'Banana' from top: " + position);

        // 7. Pop all elements
        System.out.println("\nPopping all elements:");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        // Verify stack is empty
        System.out.println("Final stack: " + stack);
        System.out.println("Is stack empty? " + stack.isEmpty());
    }

    public static void loops() {
        ArrayList<String> users = new ArrayList<String>();
        users.add("Sam");
        users.add("Davey");
        users.add("Frodo");

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        //Loop over a string front and back
        users.forEach((s)->System.out.println(s));
        //userQueue.forEach(user -> System.out.println(user.userName));

    }


}

class Simple {
    private String userName;

    public Simple(String userName) {
        this.userName = userName;
    }

    //Get Username
    public String getUserName() {
        System.out.println(userName);
        return userName;
    }

    //Set Username
    public void setUserName(String userName) {
        this.userName = userName;
    }
}


