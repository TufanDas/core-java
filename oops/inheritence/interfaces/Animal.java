package oops.inheritence.interfaces;

public interface Animal {

    // Constants in interfaces are implicitly public, static, and final.
    // So, 'int MAX_AGE = 30;' is the same as 'public static final int MAX_AGE = 30;'
    int MAX_AGE = 30;

    // Abstract methods: Must be implemented by any class that implements this interface
    void eat();
    void sleep();

    // Static method: Belongs to the interface itself. Can be called like Animal.info()
    static void info() {
        System.out.println("This is an Animal interface.");
    }

    // Default method: Provides a default implementation.
    // It can be optionally overridden by implementing classes.
    default void run(int a, int b) {
        // Calling another abstract method from the interface — this will call the actual implementation in the class
        this.eat();

        // Extra logic specific to default method
        System.out.println("Calling through object of implementation class.");
        System.out.println("Sum of a and b is: " + (a + b));
    }
}

