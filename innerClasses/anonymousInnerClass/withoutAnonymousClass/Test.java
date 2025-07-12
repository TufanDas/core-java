package innerClasses.anonymousInnerClass.withoutAnonymousClass;

public class Test {

    public static void main(String[] args) {
        // Create a new shopping cart with a total amount of $150
        ShoppingCart shoppingCart = new ShoppingCart(150);

        // Create a new CreditCard payment method with a mock card number
        CreditCard creditCart = new CreditCard("123456789");

        // Process the payment using the CreditCard instance
        shoppingCart.processPayment(creditCart);
    }
}
