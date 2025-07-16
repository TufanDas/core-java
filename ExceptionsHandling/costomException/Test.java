package ExceptionsHandling.costomException;

public class Test {
    public static void main(String[] args) {
        // Creating a new bank account with an initial balance of 10
        BankAccount account = new BankAccount(10);

        try {
            // Trying to withdraw 11, which is more than the current balance
            // This should trigger the custom InsufficientFundsExceptions
            account.withdraw(11);
        } catch (InsufficientFundsExceptions e) {
            // Catching and printing the custom exception
            System.out.println(e);
        }
    }
}
