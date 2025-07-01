package oops.abstraction;

// Abstract class representing a generic Animal
abstract class Animal {

    // Abstract method - must be implemented by any non-abstract subclass
    public abstract void sayHello();

    // Concrete method - can be used directly by subclasses
    public void sleep(){
        System.out.println("zzz...");
    }
}
