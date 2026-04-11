package multiThreading.lamda_expression;

public class LamdaExpression {
    public static void main(String[] args) {

        /*Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world.");
            }
        };*/

//        lamda expression(anonyous function)
        Runnable runnable = () -> {
            System.out.println("Hello world.");
        };

        Thread t1 = new Thread(runnable);
        t1.start();
    }
}
