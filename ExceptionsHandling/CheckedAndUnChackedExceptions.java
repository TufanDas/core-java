package ExceptionsHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedAndUnChackedExceptions {
    public static void main(String[] args) throws FileNotFoundException {
        // Starting point of the program — calling method1 which may throw FileNotFoundException
        method1();

        // This line will only execute if no exception was thrown above
        System.out.println("hello world");
    }

    static void method1() throws FileNotFoundException {
        // method1 calls method2 and propagates the exception up to main
        method2();
    }

    static void method2() throws FileNotFoundException {
        // Trying to read from a file — this can throw a checked exception (FileNotFoundException)
        FileReader fileReader = new FileReader("allAboutExceptionHandling.txt");
    }
}