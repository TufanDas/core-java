package oops.polymorphism.runtimePolymorphism;

// The Dog class also inherits from Animal and overrides sayHello
class Dog extends Animal {

    // Overriding sayHello to behave like a dog
    @Override
    public void sayHello() {
        System.out.println("Woof");
    }
}
