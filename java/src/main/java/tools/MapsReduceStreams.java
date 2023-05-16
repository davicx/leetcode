package tools;

import java.util.ArrayList;
import java.util.Arrays;

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
        //List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah");
        users.stream()
                .map(String::toLowerCase)
                .filter(user -> user.startsWith("s"))
                .forEach(System.out::println);
        //Map

        //Stream

        //Reduce

    }
}

/*
		// 4. Stream.of, sorted and findFirst
		Stream.of("Ava", "Aneri", "Alberto")
			.sorted()
			.findFirst()
			.ifPresent(System.out::println);

		// 5. Stream from Array, sort, filter and print
		String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah"};
		Arrays.stream(names)	// same as Stream.of(names)
			.filter(x -> x.startsWith("S"))
			.sorted()
			.forEach(System.out::println);

 */
