package learning;

import java.util.Comparator;

public class CompareUsername implements Comparator<AUser> {

    @Override
    public int compare(AUser u1, AUser u2) {
        if(u1.getUserName().compareTo(u2.getUserName()) > 1) {
            return 1;
        } else if (u1.getUserName().compareTo(u2.getUserName()) < 1) {
            return -1;
        } else {
            return 0;
        }

    }
}
