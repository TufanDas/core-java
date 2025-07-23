package multiThreading.ThreadMethods;

public class MyThread extends Thread {

    // This is the code that runs when the thread is started
    public void run() {
        try {
            // Make this thread sleep (pause) for 5 seconds (5000 ms)
            Thread.sleep(5000);
        } catch (InterruptedException I) {
            // If the thread is interrupted during sleep, this message is printed
            System.out.println("Hello world.");
        }
    }

    public static void main(String[] args) {
        // Create a new thread object
        MyThread t1 = new MyThread();

        // Start the thread — this runs the `run()` method in a separate thread
        t1.start();

        try {
            // Pause the main thread until t1 is finished
            t1.join();
        } catch (InterruptedException e) {
            // Handle interruption during the join process
            System.out.println(e);
        }

        // This line runs only after t1 has finished
        System.out.println("In the main Thread.");
    }
}


// start(); run(){},sleep(1000),join(); setPriority(),
