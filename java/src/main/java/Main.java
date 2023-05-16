import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //CONTROL
        //For Loop
        for (int i = 0; i < 5; i++) {
            //System.out.println(i);
        }

        //DATA STRUCTURES
        //Array
        int[] myArray = new int[3];
        String[] currentUsers = {"david", "sam", "bilbo"};

        //Array List (Resizable)
        ArrayList<String> users = new ArrayList<String>();
        users.add("sam");
        users.add("frodo");
        users.add("david");
        users.size();
        //users.get(0);
        //users.set(0, "merry");
        //users.clear();
        for (String user : users) {
            System.out.println(user);
        }

        Collections.sort(users);
        System.out.println("");
        //Collections.reverse(users);

        for (String user : users) {
            System.out.println(user);
        }

        //Set
        Set<Integer> mySet = new HashSet<Integer>();

        //Hash Map
        int[] nums = {2, 7, 11, 15};
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            myMap.put(nums[i], i);
        }
        myMap.entrySet().forEach(entry->{
            //System.out.println(entry.getKey() + " " + entry.getValue());
        });

        //Stack
        Stack<String> friends = new Stack<String>();
        friends.add("frodo");
        friends.add("bilbo");
        friends.add("sam");
        //System.out.println(friends.pop());
        //System.out.println(friends.peek());
        //friends.empty();
        //friends.get(0);
        for (int i = 0; i < friends.size(); i++) {
            //System.out.println(friends.get(i));
        }

        //Queue
        Queue<String> queue = new LinkedList<>();

        // add elements to the queue
        queue.add("apple");
        queue.add("banana");
        queue.add("cherry");

        // print the queue
        System.out.println("Queue: " + queue);

        // remove the element at the front of the queue
        String front = queue.remove();
        System.out.println("Removed element: " + front);

        // print the updated queue
        System.out.println("Queue after removal: " + queue);

        // add another element to the queue
        queue.add("date");

        // peek at the element at the front of the queue
        String peeked = queue.peek();
        System.out.println("Peeked element: " + peeked);

        // print the updated queue
        System.out.println("Queue after peek: " + queue);


    }
}

