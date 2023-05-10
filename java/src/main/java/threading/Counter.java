package threading;

public class Counter {
    Integer count;

    public Counter(Integer count) {
        this.count = count;
    }

    public synchronized void increment() {
        System.out.println(count);
        count++;
    }
}
