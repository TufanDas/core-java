package oops.abstraction;

// Dog class extends Animal and provides its own implementation of sayHello
class Dog extends Animal {

    // Overriding the abstract method from Animal
    @Override
    public void sayHello() {
        System.out.println("Woof");
    }
}