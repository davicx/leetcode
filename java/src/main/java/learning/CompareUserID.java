package learning;
import java.util.Comparator;

//May have broke
class CompareUserID implements Comparator<User> {

    @Override
    public int compare(User u1, User u2) {
        if(u1.getUserID() > u2.getUserID()) {
            return 1;
        } else if (u1.getUserID() < u2.getUserID()) {
            return -1;
        } else {
            return 0;
        }
    }
}
