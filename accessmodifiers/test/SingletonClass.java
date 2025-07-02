package accessmodifiers.test;

// Singleton design pattern ensures that only ONE object of this class can ever be created.
// It's useful when you need to control object creation — like for database connections, logging, etc.

public class SingletonClass {

    // This static variable holds the single instance of the class.
    // It starts as null and gets initialized only once.
    private static SingletonClass instance;

    // Private constructor means no other class can create an object using 'new'.
    // This is the key to making sure only one object exists.
    private SingletonClass() {
        // Object creation logic could go here
    }

    // Public method to provide access to the single instance.
    // If the instance doesn't exist yet, create it. Otherwise, return the existing one.
    public static SingletonClass createObject() {
        if (instance == null) {
            instance = new SingletonClass(); // Create the one and only instance
            System.out.println("The Object of the Singleton Class is created.");
        }
        return instance; // Return the same instance every time
    }
}
