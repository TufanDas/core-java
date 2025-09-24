package multiThreading.Locking;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairnessLockExample {
    private  final Lock Lock = new ReentrantLock(true); // fairness locks

    public void accessRecource(){
        Lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " accuired the lock.");
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            System.out.println(Thread.currentThread().getName() + " Relese The lock.");
            Lock.unlock();
        }
    }

    public static void main(String[] args) {
        FairnessLockExample example = new FairnessLockExample();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                example.accessRecource();
            }
        };

        Thread thread1 = new Thread(task, "Thread1");
        Thread thread2 = new Thread(task, "Thread2");
        Thread thread3 = new Thread(task, "Thread3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
