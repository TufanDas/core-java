package innerClasses.anonymousInnerClass.withoutAnonymousClass;

// Concrete implementation of the Payment interface
public class CreditCard implements Payment {

    // Stores the credit card number used for payment
    private String craditCardNumber;

    // Constructor to initialize credit card number
    public CreditCard(String craditCardNumber) {
        this.craditCardNumber = craditCardNumber;
    }

    // Implementation of the pay method from the Payment interface
    // Simulates processing a payment using a credit card
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " Using Credit Card Number: " + craditCardNumber);
    }
}
