package threading;

public class MultiThreadInherit extends Thread {
    private int threadNumber;

    public MultiThreadInherit (int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            /*
            if(threadNumber == 3) {
                throw new RuntimeException();
            }
            */

            System.out.println(i + " from thread " + threadNumber);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
