package accessmodifiers.school;
// A class can have only two types of access modifiers:
// 1. public (accessible from anywhere)
// 2. default (no modifier, accessible only within the same package)

// This class is marked as public, so it can be used from other packages too.
public class Student {

    // Public variable: Can be accessed directly from anywhere (not recommended in real-world practice).
    public String name;

    // Another public variable to hold age.
    public int age;

    // Public method: can be called using an object of the class.
    // This method simply prints a hello message.
    public void satHello(){
        System.out.println("Saying Hello.");
    }

    // Static method: can be called without creating an object.
    // This method prints a goodbye message.
    public static void satBye(){
        System.out.println("Saying Bye.");
    }
}
