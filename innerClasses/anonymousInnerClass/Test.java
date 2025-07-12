package innerClasses.anonymousInnerClass;



public class Test {

    public static void main(String[] args) {

        // First shopping cart with a total of 1230
        ShoppingCart shoppingCart = new ShoppingCart(1230);

        // Processing payment using an anonymous class that simulates a credit card payment
        shoppingCart.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid " + amount + " Using Credit Card.");
            }
        });

        // Second shopping cart with a different amount
        ShoppingCart shoppingCart2 = new ShoppingCart(9990.90);

        // Processing payment using another anonymous class that simulates PayPal
        shoppingCart2.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid " + amount + " Using Pay Pal.");
            }
        });
    }
}
