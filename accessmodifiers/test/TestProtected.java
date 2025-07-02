package accessmodifiers.test;

import accessmodifiers.zoo.Dog;

public class TestProtected {
    public static void main(String[] args) {

        // Creating a Dog object with the name "Tufan Das"
        Dog dog = new Dog("Tufan Das");

        // Calling the method to make the dog produce its default sound ("Bark")
        dog.makeSound();

        // The line below is commented out because it would cause a compile-time error.
        // The method `changeSound()` is protected and we're trying to access it from a different package.
        // Protected methods can only be accessed from:
        // - the same class
        // - subclasses (even in other packages)
        // - classes in the same package
        //
        // dog.changeSound("Bark"); //  Not allowed here if this class is in another package

        // Instead, we use a public method from the Dog class that internally calls the protected method.
        // This is a smart way to expose limited functionality while keeping the internal logic protected.
        dog.setDogSound("woof");

        // Check the updated sound
        dog.makeSound();

        // Call another public method that simulates the dog wagging its tail
        dog.wagTail();
    }
}
