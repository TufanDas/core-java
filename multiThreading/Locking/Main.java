package multiThreading.Locking;

public class Main {
    public static void main(String[] args) {

        BankAccount sbi = new BankAccount();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                sbi.withdraw(50);
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        t2.start();
        t1.start();
    }
}
