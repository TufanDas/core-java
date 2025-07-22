package multiThreading;

public class Test {
    public static void main(String[] args) {

        Hello h = new Hello();

        // Pass the Runnable to a new Thread and start it
        Thread t = new Thread(h);
        t.start();  // Starts a new thread running Hello's run() method

        // Create and start a thread by extending Thread class
        World world = new World();
        world.start();  // Starts a new thread running World’s run() method

        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Main Thread is Running...");
        }
    }
}
