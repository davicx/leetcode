package threading;


public class MultiThreadInterface implements Runnable {
    private int threadNumber;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " from thread " + threadNumber);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}
