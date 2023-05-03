package threading;

public class MainThreads {
    //Two Ways
    //1) Extend Thread Class (Inherit)
    //2)

    public static void main(String[] args) {
        MultiThreadInherit myThread = new MultiThreadInherit(1);
        MultiThreadInherit myThreadTwo = new MultiThreadInherit(2);
        myThread.start();
        //myThreadTwo.start();
        //manyThreads();

        //useInterface();

        //Important Methods
        /*
        myThread.start();
        myThread.isAlive();
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         */


    }

    public static void manyThreads() {
        for (int i = 0; i < 5; i++) {
            MultiThreadInherit myThread = new MultiThreadInherit(i);
            myThread.start();
        }
    }

    public static void useInterface() {
        MultiThreadInterface myThread = new MultiThreadInterface();
        Thread myInterfaceThread = new Thread(myThread);
        myInterfaceThread.start();
    }

}
