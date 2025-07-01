package oops.abstraction;

// Main class to test abstraction and method overriding
public class TestAbstraction {
    public static void main(String args[]) {

        // Creating a Dog object using Dog reference
        Dog dog1 = new Dog();
        dog1.sayHello(); // Calls Dog's version of sayHello()

        // Creating a Dog object but referencing it as Animal (polymorphism)
        Animal dog2 = new Dog();
        dog2.sayHello(); // Still calls Dog's version because of dynamic dispatch



        Vehicle myCycle = new Cycle(); // Creating Cycle object
        myCycle.acclerete();           // Cycle-specific implementation
        myCycle.decelerate();          // Cycle-specific implementation

        Vehicle myCar = new Car();     // Creating Car object
        myCar.acclerete();             // Car-specific implementation
        myCar.decelerate();            // Car-specific implementation

    }
}
