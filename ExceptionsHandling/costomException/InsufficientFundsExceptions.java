package ExceptionsHandling.costomException;

// Custom exception class to handle cases where a user doesn't have enough funds
public class InsufficientFundsExceptions extends Exception {

    private double amount;  // The amount that caused the exception (e.g., attempted withdrawal)

    // Constructor accepts the amount and sets a custom error message
    public InsufficientFundsExceptions(double amount) {
        super("What do you want? You don't have money.");  // Custom message passed to the Exception class
        this.amount = amount;
    }

    // Getter method to retrieve the insufficient amount
    public double getAmount() {
        return amount;
    }
}
