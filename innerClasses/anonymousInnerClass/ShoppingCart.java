package innerClasses.anonymousInnerClass;


// Represents a basic shopping cart system
public class ShoppingCart {

    // Holds the total amount to be paid for items in the cart
    private double totalAmount;

    // Constructor to initialize the cart with a total amount
    public ShoppingCart(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    // This method delegates the payment to the passed-in Payment implementation
    // The idea is to decouple the cart from specific payment logic (e.g., CreditCard, UPI, etc.)
    public void processPayment(Payment paymentMethod) {
        paymentMethod.pay(totalAmount);
    }
}

