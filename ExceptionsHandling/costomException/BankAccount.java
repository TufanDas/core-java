package ExceptionsHandling.costomException;

// Simple class representing a bank account
public class BankAccount {

    private double balance; // Stores the current balance of the account

    // Constructor to initialize the account with a starting balance
    public BankAccount(double amount) {
        this.balance = amount;
    }

    // Method to withdraw money from the account
    // Throws InsufficientFundsExceptions if the requested amount exceeds balance
    public void withdraw(double amount) throws InsufficientFundsExceptions {
        // Check if balance is sufficient
        if (amount > balance) {
            // Throw a custom exception if there's not enough money
            throw new InsufficientFundsExceptions(amount);
        }

        // Deduct the amount from the current balance
        balance -= amount;
    }
}

