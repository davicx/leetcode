package tools;

import java.util.ArrayList;

public class MapsReduceStreams {
    public static void main(String[] args) {
        User davey = new User(1, "davey");
        User frodo = new User(2, "frodo");
        User sam = new User(3, "sam");
        User merry = new User(4, "merry");
        User pippin = new User(5, "pippin");

        ArrayList<User> userObjects = new ArrayList<User>();
        userObjects.add(sam);
        userObjects.add(pippin);
        userObjects.add(merry);
        userObjects.add(davey);
        userObjects.add(frodo);

        ArrayList<String> users = new ArrayList<String>();
        users.add("Sam");
        users.add("frodo");
        users.add("david");

        //Filter
         users.stream()
                .map(String::toLowerCase)
                .filter(user -> user.startsWith("s"))
                .forEach(System.out::println);

        // MAP: convert all user names to uppercase
        System.out.println("\nMAP:");
        users.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // STREAM: get a list of usernames from userObjects and print them
        System.out.println("\nSTREAM:");
        userObjects.stream()
                .map(user -> user.getUserName())
                .forEach(System.out::println);

        // REDUCE: concatenate all usernames into a single string, separated by commas
        System.out.println("\nREDUCE:");
        String result = users.stream()
                .reduce((a, b) -> a + ", " + b)
                .orElse("No users");
        System.out.println(result);

    }
}
