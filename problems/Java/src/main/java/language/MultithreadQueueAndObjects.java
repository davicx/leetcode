package language;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;


public class MultithreadQueueAndObjects {
    public static void main(String[] args) throws InterruptedException {
        Queue<Person> peopleQueue = new ConcurrentLinkedQueue<>();

        // Add people to queue
        peopleQueue.add(new Person("Frodo"));
        peopleQueue.add(new Person("Sam"));
        peopleQueue.add(new Person("Merry"));
        peopleQueue.add(new Person("Pippin"));

        // Define a task that processes people from the queue
        Runnable task = () -> {
            while (!peopleQueue.isEmpty()) {
                Person person = peopleQueue.poll(); // safely removes and returns head
                if (person != null) {
                    for (int i = 0; i < 5; i++) {
                        person.incrementCount(); // safely increment
                    }
                    System.out.println(Thread.currentThread().getName() + " processed " + person);
                }
            }
        };

        // Create and start threads
        Thread t1 = new Thread(task, "Thread-A");
        Thread t2 = new Thread(task, "Thread-B");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("All threads done.");
    }
}

class Person {
    String name;
    int count;

    public Person(String name) {
        this.name = name;
        this.count = 0;
    }

    public synchronized void incrementCount() {
        this.count++;
    }

    @Override
    public String toString() {
        return name + ": " + count;
    }
}
