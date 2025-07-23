package multiThreading.ThreadMethods;

public class MyThread2 extends Thread {

    // Constructor: sets the name of the thread using the superclass constructor
    public MyThread2(String name) {
        super(name);
    }

    // This method will run when the thread is started
    public void run() {
        String s = "";
        // Outer loop runs 5 times
        for (int i = 0; i < 5; i++) {

            // Inner loop: just adds a lot of "a" characters to slow down the thread
            for (int j = 0; j < 100000; j++) {
                s += "a";
            }

            // Print the thread's name, priority, and current loop count
            System.out.println(Thread.currentThread().getName() +
                    " - priority : " + Thread.currentThread().getPriority() +
                    " count : " + i);
        }
    }

    public static void main(String[] args) {
        // Creating three thread objects, all named "Tufan"
        MyThread2 l = new MyThread2("Low Priority Thread");
        MyThread2 m = new MyThread2("Medium Priority Thread");
        MyThread2 h = new MyThread2("High Priority Thread");

        // Set thread priorities: MIN = 1, NORM = 5, MAX = 10
        l.setPriority(Thread.MIN_PRIORITY);   // 1
        m.setPriority(Thread.NORM_PRIORITY);  // 5
        h.setPriority(Thread.MAX_PRIORITY);   // 10

        // Start all three threads
        l.start();
        m.start();
        h.start();
    }
}
