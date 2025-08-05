package multiThreading.Synchronization;

public class BankAccount {

    private int balance = 100;

    public synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);

        if(balance >= amount){
            System.out.println(Thread.currentThread().getName() + " proceding with withdrawl.");
            try {
                Thread.sleep(10000);
            }catch (Exception e){

            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " complete withdrawl. Remaining balance " + balance);
        }else {
            System.out.println(Thread.currentThread().getName() + " Insufficient Blance. ");
        }
    }
}
