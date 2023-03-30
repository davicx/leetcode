package sort;
import java.util.Comparator;

public class UserIDSort implements Comparator<MyUser> {

    @Override
    public int compare(MyUser userOne, MyUser userTwo) {
        return userOne.getUserId() - userTwo.getUserId();
    }
}
