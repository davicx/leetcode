package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class MyHitCounter {
    public static void main(String[] args) {
        System.out.println("hiya!");
        //Five Minutes (300 Seconds)

        HitCounter counter = new HitCounter();

        for (int i = 0; i < 100000; i++) {
            counter.hit(1);
        }

        //counter.hit(2);
        //counter.hit(3);
        counter.getHits(4);

        //counter.hit(300);
        //counter.getHits(300);
        //counter.getHits(900);

    }
}

class HitCounter {
    Queue<Integer> queue;

    public HitCounter() {
        queue = new LinkedList<Integer>();

    }

    public void hit(int timestamp) {
        queue.offer(timestamp);
    }

    public void showQueue() {

    }

    public int getHits(int timestamp) {
        while(!queue.isEmpty() && timestamp - queue.peek() >= 300) {
            queue.poll();
        }
        System.out.println(queue.size());
        return queue.size();
    }

}
