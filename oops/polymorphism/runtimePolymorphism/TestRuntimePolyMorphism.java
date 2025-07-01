package oops.polymorphism.runtimePolymorphism;

/*
Polymorphism is a key concept in Object-Oriented Programming (OOP)
It allows the same method to behave differently based on the object it's acting on.

There are two main types of polymorphism:
1. Compile-time polymorphism (Method Overloading)
2. Run-time polymorphism (Method Overriding)

This example demonstrates **run-time polymorphism** using method overriding.
*/


public class TestRuntimePolyMorphism {
    public static void main(String[] args) {
        // Creating an object of Animal class
        Animal myAnimal = new Animal();
        myAnimal.sayHello();  // Output: ...

        // Creating a Dog object and calling sayHello
        Dog myDog1 = new Dog();
        myDog1.sayHello();    // Output: Woof

        // Creating a Cat object and calling sayHello
        Cat myCat1 = new Cat();
        myCat1.sayHello();    // Output: Meow

        // ---------------- Runtime Polymorphism Starts Here ----------------

        // Animal reference pointing to Dog object (upcasting)
        Animal myDog2 = new Dog();
        myDog2.sayHello();    // Output: Woof — Dog's version is called

        // Animal reference pointing to Cat object (upcasting)
        Animal myCat2 = new Cat();
        myCat2.sayHello();    // Output: Meow — Cat's version is called

        // Even though the reference is of type Animal,
        // the actual method executed depends on the object's type (Dog/Cat)
    }

}
