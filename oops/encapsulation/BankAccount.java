package oops.encapsulation;

// Represents a simple bank account with deposit and withdraw functionality
class BankAccount {

    private long accountNumber;  // Account number (not used here, but good to have)
    private double balance;      // Current balance in the account

    // Method to deposit money into the account
    public void deposite(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Your deposited amount is: " + amount);
            System.out.println("Your current balance is: " + this.balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            System.out.println("Your withdrawn amount is: " + amount);
            System.out.println("Your current balance is: " + this.balance);
        } else {
            System.out.println("Insufficient balance or invalid withdraw amount.");
        }
    }
}