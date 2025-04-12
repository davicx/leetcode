package language;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

public class MultithreadingExample {
    public static void main(String[] args) {
        //usingExtends();
        //usingImplements();
        /*
        try {
            sharedDataUnsafe();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        */

        try {
            sharedDataSafe();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    //EXAMPLE 4: Other Data
    private static void hashMapExample() throws InterruptedException {
            ConcurrentMap<String, Integer> userScores = new ConcurrentHashMap<>();

            Runnable task = () -> {
                for (int i = 0; i < 100; i++) {
                    userScores.merge("score", 1, Integer::sum); // thread-safe
                }
            };

            Thread t1 = new Thread(task);
            Thread t2 = new Thread(task);

            t1.start();
            t2.start();
            t1.join();
            t2.join();

            System.out.println("Final score: " + userScores.get("score"));

    }

    private static void arrayListExample() throws InterruptedException {
        List<String> sharedList = Collections.synchronizedList(new ArrayList<>());

        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                sharedList.add(Thread.currentThread().getName() + " - " + i);
            }
        };

        Thread t1 = new Thread(task, "T1");
        Thread t2 = new Thread(task, "T2");

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("List size: " + sharedList.size());

        //Safe Iteration
        /*
        List<String> sharedList = Collections.synchronizedList(new ArrayList<>());

        // Add some data (maybe from multiple threads)
        sharedList.add("A");
        sharedList.add("B");
        sharedList.add("C");

        // Safely iterate
        synchronized(sharedList) {
            for (String item : sharedList) {
                System.out.println(item); // only one thread is allowed in this block at a time
            }
        }
         */
    }

    //EXAMPLE 3: Special Integer
    private static void specialInteger() throws InterruptedException {
        AtomicInteger counter = new AtomicInteger(0);

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.incrementAndGet(); // atomic and thread-safe
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final count (should be 2000): " + counter.get());

    }

    //EXAMPLE 2: Using threads with shared data
    private static void sharedDataSafe() throws InterruptedException {
        SafeCounter counter = new SafeCounter();

        Runnable task = () -> {
            for (int i = 0; i < 2000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count (should be 2000): " + counter.getCount());

    }


    private static void sharedDataUnsafe() throws InterruptedException {
        Counter counter = new Counter();

        Runnable task = () -> {
            for (int i = 0; i < 2000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join(); // Wait for threads to finish
        t2.join();

        System.out.println("Final count (should be 2000): " + counter.count);
    }

    //EXAMPLE 1: Using threads without shared data
    //Notes
    //.start() launches the thread and calls its run() in a separate path of execution.
    //Don't call .run() directly — that runs it on the main thread.
    //synchronized, wait(), and notify() come into play for shared resources or coordination.

    private static void usingImplements() {
        Thread t1 = new Thread(new MyRunnable("Thread A"));
        Thread t2 = new Thread(new MyRunnable("Thread B"));

        t1.start();
        t2.start();

        System.out.println("Main thread finished launching both threads.");
    }


    //Not as preferred
    private static void usingExtends() {
        MyThread t1 = new MyThread("Alpha");
        MyThread t2 = new MyThread("Beta");

        t1.start();
        t2.start();
    }




}

class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        // This is what the thread will do
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " - Count: " + i);
            try {
                Thread.sleep(500); // sleep for 500ms
            } catch (InterruptedException e) {
                System.out.println(name + " was interrupted");
            }
        }
    }
}

class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("EXTENDS");
        for (int i = 1; i <= 3; i++) {
            System.out.println(name + " is running: " + i);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println(name + " was interrupted.");
            }
        }
    }
}

class SafeCounter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class Counter {
    public int count = 0;

    public void increment() {
        count++; // NOT thread-safe!
    }
}
