package learning;
import java.util.Comparator;

//May have broke
class CompareUserID implements Comparator<AUser> {

    @Override
    public int compare(AUser u1, AUser u2) {
        if(u1.getUserID() > u2.getUserID()) {
            return 1;
        } else if (u1.getUserID() < u2.getUserID()) {
            return -1;
        } else {
            return 0;
        }
    }
}
