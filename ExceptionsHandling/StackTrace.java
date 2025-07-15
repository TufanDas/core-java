package ExceptionsHandling;

public class StackTrace {
    public static void main(String[] args) {

//        level1(); // got an exceptions error

        try {
            level1();
        } catch (ArrayIndexOutOfBoundsException x) {
            // If an ArrayIndexOutOfBoundsException occurs, control jumps here

            // Print the complete stack trace to standard error (helps in debugging)
            x.printStackTrace();

            // Informing that exception was handled
            System.out.println("Exception handled.");
            System.out.println("Stack Traced.");

            // Now printing the stack trace details manually for deeper inspection
            StackTraceElement[] stackTrace = x.getStackTrace();

            // Looping through each element in the stack trace array
            for (int i = 0; i < stackTrace.length; i++) {
                // Each element gives you the class name, method name, and line number where the error passed through
                System.out.println(stackTrace[i]);
            }
        }
    }
    static void level3(){
         int arr[] = new int[5];
         arr[0] = 3;
         arr[5] = 10;
    }
    static void level2(){
        level3();
    }
    static void level1(){
        level2();
    }
}
