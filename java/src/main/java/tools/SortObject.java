package tools;

import learning.AUser;

import java.util.ArrayList;
import java.util.Comparator;

public class SortObject {
    public static void main(String[] args) {

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

        //Sort with Lambda
        users.forEach((s)->System.out.println(s.userName));
        System.out.println("  ");
        //users.sort((User userOne, User userTwo)->userOne.getUserID()-userTwo.getUserID());
        users.sort(Comparator.comparingInt(User::getUserID));
        users.forEach((s)->System.out.println(s.userName));
        System.out.println(" ");
        //users.sort((User userOne, User userTwo)->userOne.getUserName().compareTo(userTwo.getUserName()));
        users.sort(Comparator.comparing(User::getUserName));
        users.forEach((s)->System.out.println(s.userName));
        System.out.println(" ");

    }
}

class User {
    public Integer userID;
    public String userName;
    public String location;

    public User(Integer inputUserID, String inputUserName) {
        this.userID = inputUserID;
        this.userName = inputUserName;
    }

    public Integer getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getLocation() {
        return location;
    }

    public void sayHi() {
        System.out.println("hello!!");
    }




}