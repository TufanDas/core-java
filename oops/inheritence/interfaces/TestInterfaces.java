package oops.inheritence.interfaces;

public class TestInterfaces {

    /*
     * A class is a blueprint for creating objects.
     * An interface is a blueprint for classes — it only contains abstract methods and static constants.
     *
     * Purpose of an interface:
     * - Achieve abstraction
     * - Support multiple inheritance (Java does not allow multiple class inheritance)
     *
     * Modern Java interfaces can also contain:
     * - Static methods
     * - Default methods (which can have a body and accept parameters)
     */

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();                              // Output: Dog is eating.
        dog.sleep();                            // Output: Dog is sleeping.
        System.out.println(dog.MAX_AGE);        // Output: 30
        System.out.println(Animal.MAX_AGE);     // Output: 30
        dog.run(10, 20);                        // Calls default method from interface

        System.out.println();

        Cat cat = new Cat();
        cat.eat();                              // Output: Cat is eating.
        cat.sleep();                            // Output: Cat is sleeping.
        System.out.println(cat.MAX_AGE);        // Output: 30
        System.out.println(Cat.MAX_AGE);        // Output: 30
        cat.run(10, 20);                        // Calls default method from interface
    }
}
