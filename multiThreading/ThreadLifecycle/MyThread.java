package multiThreading.ThreadLifecycle;

public class MyThread extends Thread{

//   method that will run in the new thread
    public void run(){
        System.out.println("Running State...."); // 3:Running State....
        try {
        Thread.sleep(2000);

        }catch (InterruptedException e){ // Handle if the thread was interrupted while sleeping
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException{

        MyThread t1 = new MyThread();
        System.out.println(t1.getState()); // New state

        t1.start();
        System.out.println(t1.getState()); // RUNNABLE state

        Thread.sleep(200);
        System.out.println(t1.getState()); // TIMED_WAITING - this thread is sleeping now for 200 ms.

        t1.join(); // Wait for the thread to finish completely
        System.out.println(t1.getState());// TERMINATED - thread has finished execution
    }
}
