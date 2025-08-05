package multiThreading.Locking;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class ReentrantExample {

    // Create a ReentrantLock instance — this allows the same thread to acquire the lock multiple times
    private final Lock lock = new ReentrantLock();

    // Outer method tries to acquire the lock and then calls innerMethod
    public void outerMethod() {
        lock.lock(); // First lock acquisition
        try {
            System.out.println("Inside OuterMethod.");
            innerMethod(); // Call to innerMethod which also tries to acquire the same lock
        } catch (Exception e) {
            // Logging can be added here in real apps
        } finally {
            // Always release the lock to avoid deadlocks
            lock.unlock();
        }
    }

    // Inner method also tries to acquire the same lock, leading to a recursive call back to outerMethod
    public void innerMethod() {
        lock.lock(); // Second lock acquisition — same thread, so allowed in ReentrantLock
        try {
            System.out.println("Inside InnerMethod.");
            outerMethod(); // Recursive call to outerMethod will again try to acquire the lock
        } catch (Exception e) {
            // Exception handling placeholder
        } finally {
            // Unlock for the inner method
            lock.unlock();
        }
    }

    public static void main(String[] args) {

        ReentrantExample example = new ReentrantExample();

        example.outerMethod();
    }
}

