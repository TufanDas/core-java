package ExceptionsHandling;

// Importing Student class from another package
import statickeywords.test.Student;

public class ExceptionHandling1 {

    // A method that performs division and may throw exceptions
    static int devide(int a, int b) {
        try {
            // Creating a null student to intentionally cause a NullPointerException
            Student student = null;

            // This line will throw a NullPointerException
            student.setId(1002);
            System.out.println(student.getId());

            // This line will throw ArithmeticException if b == 0
            return a / b;

        } catch (ArithmeticException e) {
            // Catching division by zero
            System.out.println(e);
            return -1;

        } catch (NullPointerException e) {
            // Catching access on null object (student in this case)
            System.out.println(e);
            return -1;
        }
    }

    public static void main(String[] args) {

        // Sample arrays of numerators and denominators
        int numerators[] = {10, 200, 30, 40};
        int denominarators[] = {1, 2, 0, 4};

        // Loop intentionally goes beyond array length to trigger ArrayIndexOutOfBoundsException
        for (int i = 0; i < 10; i++) {
            try {
                // Call the divide method for each pair
                System.out.println(devide(numerators[i], denominarators[i]));

            } catch (ArrayIndexOutOfBoundsException e) {
                // Catching if index goes out of bounds of the arrays
                System.out.println(e);
            }
        }
    }
}
