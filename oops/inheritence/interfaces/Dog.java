package oops.inheritence.interfaces;

// 'Dog' is a class that follows the blueprint defined by the 'Animal' interface
public class Dog implements Animal {

    // Implementation of the 'eat' method from the Animal interface
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    // Implementation of the 'sleep' method from the Animal interface
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }
}
