package multiThreading;

// Hello class implements Runnable, so it can be executed by a Thread
public class Hello implements Runnable {

    // This method is called when the thread is started
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Hello......");
        }
    }
}

