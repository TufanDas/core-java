package ExceptionsHandling;

public class FinallyKeyword {
    public static void main(String[] args) {
        System.out.println(devide(10,2));
    }


    static int devide(int a, int b){
        try {

            return a/b;

        }catch (ArithmeticException e){

            return -1;

        }finally {

            System.out.println("Exceptions occure or not finally block will execute.");

        }
    }
}
