package learning;

import java.util.Iterator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        //PriorityQueue<Integer> myQueue = new PriorityQueue<Integer>();
        //myQueue.add(3);
        //myQueue.add(8);
        //myQueue.add(2);
        //myQueue.add(1);
        //System.out.println(myQueue);
        //PriorityQueue<User> users = new PriorityQueue<>(new CompareUsername());
        PriorityQueue<AUser> AUsers = new PriorityQueue<>(new CompareUserID());

        AUser davey = new AUser("davey");
        AUser frodo = new AUser("frodo");
        AUser sam = new AUser("sam");
        AUser merry = new AUser("merry");
        AUser pippin = new AUser("pippin");

        davey.setUserID(1);
        frodo.setUserID(2);
        sam.setUserID(3);
        merry.setUserID(4);
        pippin.setUserID(5);

        AUsers.add(sam);
        AUsers.add(davey);
        AUsers.add(frodo);
        AUsers.add(pippin);
        AUsers.add(merry);

        //System.out.println(users.poll());
        Iterator value = AUsers.iterator();

        while (value.hasNext()) {
            System.out.println(value.next());
        }
        System.out.println("");
        System.out.println(AUsers.poll());
        System.out.println(AUsers.poll());
        System.out.println(AUsers.poll());
        System.out.println(AUsers.poll());
        System.out.println(AUsers.poll());





    }
}
