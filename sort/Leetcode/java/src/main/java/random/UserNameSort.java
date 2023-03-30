package sort;

import java.util.Comparator;

public class UserNameSort implements Comparator<MyUser> {

    @Override
    public int compare(MyUser userOne, MyUser userTwo) {
        return userOne.getUserName().compareTo(userTwo.getUserName());
    }
}
