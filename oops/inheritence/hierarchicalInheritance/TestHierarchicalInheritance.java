package oops.inheritence.hierarchicalInheritance;

public class TestHierarchicalInheritance {
    public static void main(String args[]) {
// Create first Dog object using default constructor
        Dog dog1 = new Dog();

// dog1 has default values (name = "Rob", age = 0)
        System.out.println(dog1.getName()); // Prints: Rob
        System.out.println(dog1.getAge());  // Prints: 0
        System.out.println();

// Create second Dog object and assign custom values
        Dog dog2 = new Dog();
        dog2.setName("Dog 2"); // Set a custom name
        dog2.setAge(35);       // Set a custom age

// Output dog2's info
        System.out.println("The name of the Dog2 is: " + dog2.getName());
        System.out.println("The age of the Dog2 is: " + dog2.getAge());

        // Call methods from Animal and Dog
        dog2.eat();       // Inherited from Animal
        dog2.sayHello();  // Overridden by Dog (prints: woof)


        Cat cat1 = new Cat();
        cat1.sayHello();  // Overridden by Cat (prints: woof)

    }
}
