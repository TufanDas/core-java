package multiThreading.Synchronization;

public class MyThread extends Thread {

    // Reference to the shared Counter instance
    private Counter counter;

    // Constructor receives the shared counter and stores it for use
    public MyThread(Counter counter) {
        this.counter = counter;
    }

    // This method is called when the thread starts
    @Override
    public void run() {
        // Each thread will increment the counter 1000 times
        for (int i = 0; i < 1000; i++) {
            counter.increment();  // Safe increment because Counter handles synchronization
        }
    }
}
