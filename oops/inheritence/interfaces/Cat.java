package oops.inheritence.interfaces;

public class Cat implements Animal {

    // This method must be implemented because 'eat()' is abstract in the Animal interface.
    @Override
    public void eat() {
        System.out.println("Cat is eating.");
    }

    // Same here — required to implement the abstract method 'sleep()'.
    @Override
    public void sleep() {
        System.out.println("Cat is sleeping.");
    }
}

