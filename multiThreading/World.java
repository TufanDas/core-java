package multiThreading;

// World class extends Thread, so it represents a thread of execution
public class World extends Thread {

    // The run() method contains the code that will be executed when the thread starts
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println("World......");
        }
    }
}
