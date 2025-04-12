package tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Sorting {
    public static void main(String[] args) {
        sortObjects();

    }

    private static void sortArray() {
        String[] names = {"Frodo", "Sam", "Merry"};

        //TYPE 1: Sort Normal
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        //TYPE 2: Sort Reverse
        Arrays.sort(names, Comparator.reverseOrder());
        System.out.println(Arrays.toString(names));

        //TYPE 3:  Ignore Case
        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER.reversed());

    }

    private static void sortObjects() {
        ArrayList<User> users = createUsers();

        //TYPE 1: Unsorted
        System.out.println("TYPE 1: Unsorted");
        for (User user : users) {
            System.out.println(user.userName);
        }
        System.out.println("  ");

        //TYPE 2: Sort by User ID
        System.out.println("TYPE 2: Sort by User ID");
        users.sort(Comparator.comparingInt(User::getUserID));
        users.forEach((s)->System.out.println(s.userName));
        System.out.println(" ");

        //TYPE 3: Sort by User Name
        System.out.println("TYPE 3: Sort by User Name");
        users.sort(Comparator.comparing(User::getUserName));
        users.forEach((s)->System.out.println(s.userName));
        System.out.println(" ");

        //TYPE 4: Sort by User Name in Reverse
        System.out.println("TYPE 4: Sort by User Name in Reverse");
        users.sort(Comparator.comparing(User::getUserName).reversed());
        users.forEach((s)->System.out.println(s.userName));
        System.out.println(" ");

    }

    private static ArrayList<User> createUsers() {
        User davey = new User(1, "davey");
        User frodo = new User(2, "frodo");
        User sam = new User(3, "sam");
        User merry = new User(4, "merry");
        User pippin = new User(5, "pippin");

        ArrayList<User> users = new ArrayList<User>();
        users.add(sam);
        users.add(pippin);
        users.add(merry);
        users.add(davey);
        users.add(frodo);

        return users;

    }


}

