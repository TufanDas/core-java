package multiThreading.Locking;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class BankAccount {

    private int balance = 100;  // Initial account balance

    // Using ReentrantLock to manage concurrent access to the shared balance
    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);

        try {

            // Try acquiring the lock, wait up to 10 milliseconds
            if (lock.tryLock(10, TimeUnit.MILLISECONDS)) {

                // If we have enough balance, proceed with withdrawal
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal.");

                        // Simulate some processing delay
                        Thread.sleep(10000);

                        // Deduct the amount from the balance
                        balance -= amount;

                        System.out.println(Thread.currentThread().getName() +
                                " completed withdrawal. Remaining balance: " + balance);

                    } catch (Exception e) {

                        // You can log this exception or handle it as needed
                        System.out.println("Exception occurred during withdrawal: " + e.getMessage());

                    } finally {

                        // Always unlock in the finally block to avoid deadlocks
                        lock.unlock();

                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " - Insufficient balance.");
                }
            } else {

                // If unable to acquire lock within time, suggest retrying later
                System.out.println(Thread.currentThread().getName() + " could not acquire lock. Try again later.");

            }
        } catch (Exception e) {

            // Catch any other unexpected exceptions
            System.out.println("Unexpected exception: " + e.getMessage());
        }
    }
}
