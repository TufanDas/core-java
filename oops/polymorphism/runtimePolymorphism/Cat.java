package oops.polymorphism.runtimePolymorphism;

// The Cat class inherits from Animal and overrides sayHello
class Cat extends Animal {

    // This is method overriding - Cat gives its own implementation
    @Override
    public void sayHello() {
        System.out.println("Meow");
    }
}
