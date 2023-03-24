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
        PriorityQueue<User> users = new PriorityQueue<>(new CompareUserID());

        User davey = new User("davey");
        User frodo = new User("frodo");
        User sam = new User("sam");
        User merry = new User("merry");
        User pippin = new User("pippin");

        davey.setUserID(1);
        frodo.setUserID(2);
        sam.setUserID(3);
        merry.setUserID(4);
        pippin.setUserID(5);

        users.add(sam);
        users.add(davey);
        users.add(frodo);
        users.add(pippin);
        users.add(merry);

        //System.out.println(users.poll());
        Iterator value = users.iterator();

        while (value.hasNext()) {
            System.out.println(value.next());
        }
        System.out.println("");
        System.out.println(users.poll());
        System.out.println(users.poll());
        System.out.println(users.poll());
        System.out.println(users.poll());
        System.out.println(users.poll());





    }
}
