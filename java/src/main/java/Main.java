import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //CONTROL
        //For Loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        //DATA STRUCTURES
        //Array
        String[] currentUsers = {"david", "sam", "bilvo"};
        System.out.println(currentUsers.length);

        //Array List (Resizable)
        ArrayList<String> users = new ArrayList<String>();
        users.add("sam");
        users.add("frodo");
        users.add("david");

        //Hash Map
        int[] nums = {2, 7, 11, 15};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        map.entrySet().forEach(entry->{
            System.out.println(entry.getKey() + " " + entry.getValue());
        });


    }
}
