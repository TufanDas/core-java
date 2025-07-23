package multiThreading.ThreadMethods;

public class MyThread3 extends Thread {

    public MyThread3(String name){
        super(name);
    }

    // This method defines what each thread will do when it runs
    public void run() {
        // Loop 5 times
        for (int i = 0; i < 5; i++) {
            // Print the name of the currently running thread
            System.out.println(Thread.currentThread().getName() +"count:"+i);

            // Hint to the CPU: Let other threads run if they want
            Thread.yield();
        }

        try {
            // Print thread name again before sleeping
            System.out.println(Thread.currentThread().getName());

            // Pause the thread for 2 seconds (simulating a delay)
            Thread.sleep(2000);

            // This message shows up after the thread wakes up
            System.out.println(Thread.currentThread().getName() + " : is Running...... ");
        } catch (InterruptedException e) {
            // If the thread gets interrupted during sleep, catch the error here
            System.out.println(e);
        }

        // Just to separate output
        System.out.println();
    }

    public static void main(String[] args) {
        // Create two thread objects
        MyThread3 t1 = new MyThread3("t1");
        MyThread3 t2 = new MyThread3("t2");
        MyThread3 t3 = new MyThread3("t3");

        // Set t1 as a daemon thread (will run in the background and die when main thread ends)
        t1.setDaemon(true);

        // Start both threads — they run their `run()` methods
        t1.start();
        t2.start();

        // Interrupt t3 — if it's sleeping, it will wake up with an InterruptedException
        t3.interrupt();
    }
}

// start(); run(){},sleep(1000),join(); setPriority(),setDaemon()
