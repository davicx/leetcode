import java.util.ArrayList;

public class Sorting {
    public static void main(String[] args) {
        User davey = new User(1, "davey");
        User frodo = new User(3, "frodo");
        User sam = new User(4, "sam");
        User bilbo = new User(2, "bilbo");

        ArrayList<User> friendArrayList = new ArrayList<User>();

        friendArrayList.add(davey);
        friendArrayList.add(frodo);
        friendArrayList.add(sam);
        friendArrayList.add(bilbo);

        for (int i = 0; i < friendArrayList.size(); i++) {
            System.out.println(friendArrayList.get(i).userName + " " + friendArrayList.get(i).userId);
        }

        //Sort

    }

}
