import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

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
        //System.out.println(currentUsers.length);

        //Array List (Resizable)
        ArrayList<String> users = new ArrayList<String>();
        users.add("sam");
        users.add("frodo");
        users.add("david");
        users.get(0);
        users.set(0, "merry");
        //users.clear();
        for (String user : users) {
            //System.out.println(user);
        }

        //Hash Map
        int[] nums = {2, 7, 11, 15};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        map.entrySet().forEach(entry->{
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
            System.out.println(friends.get(i));
        }


        //Queue


    }
}

