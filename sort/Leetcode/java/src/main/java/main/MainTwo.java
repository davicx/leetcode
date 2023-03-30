package sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        MyUser davey = new MyUser(1, "davey");
        MyUser frodo = new MyUser(3, "frodo");
        MyUser sam = new MyUser(4, "sam");
        MyUser bilbo = new MyUser(2, "bilbo");

        ArrayList<MyUser> friendArrayList = new ArrayList<MyUser>();

        friendArrayList.add(davey);
        friendArrayList.add(frodo);
        friendArrayList.add(sam);
        friendArrayList.add(bilbo);

        //SORT BY NAME
        for (int i = 0; i < friendArrayList.size(); i++) {
            System.out.println(friendArrayList.get(i).userName + " " + friendArrayList.get(i).userId);
        }
        System.out.println("________");

        Collections.sort(friendArrayList, new UserNameSort());

        for (int i = 0; i < friendArrayList.size(); i++) {
            System.out.println(friendArrayList.get(i).userName + " " + friendArrayList.get(i).userId);
        }

        //SORT BY ID
        /*
        for (int i = 0; i < friendArrayList.size(); i++) {
            System.out.println(friendArrayList.get(i).userName + " " + friendArrayList.get(i).userId);
        }
        System.out.println("________");

        Collections.sort(friendArrayList, new UserIDSort());

        for (int i = 0; i < friendArrayList.size(); i++) {
            System.out.println(friendArrayList.get(i).userName + " " + friendArrayList.get(i).userId);
        }
         */
    }
}
