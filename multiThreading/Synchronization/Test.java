package multiThreading.Synchronization;

public class Test {
    public static void main(String[] args) {

        // Create a shared Counter object to be accessed by both threads
        Counter counter = new Counter();

        // Create two threads that will both increment the same counter
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        // Start both threads - they will begin executing their run() methods concurrently
        t1.start();
        t2.start();

        try {
            // Wait for both threads to finish before moving ahead
            t1.join();  // Main thread waits for t1 to finish
            t2.join();  // Main thread waits for t2 to finish
        } catch (Exception e) {
            System.out.println(e);  // Handle any exceptions during thread execution
        }

        // After both threads are done, print the final counter value
        // Expected: 2000 (each thread increments 1000 times)
        System.out.println(counter.getCount());
    }
}
