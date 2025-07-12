package innerClasses.anonymousInnerClass.withoutAnonymousClass;

// ShoppingCart class simulates a simple cart that handles payments
public class ShoppingCart {

    // Holds the total amount for the cart
    private double totalAmount;

    // Constructor to initialize the total amount of the cart
    public ShoppingCart(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    // Accepts a Payment strategy and delegates the payment processing to it
    // This allows flexibility for different payment methods (like CreditCard, PayPal, etc.)
    public void processPayment(Payment paymentMethod) {
        paymentMethod.pay(totalAmount);
    }
}
