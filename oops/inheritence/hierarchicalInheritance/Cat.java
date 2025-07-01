package oops.inheritence.hierarchicalInheritance;

// Cat class extends Animal and overrides behavior
class Cat extends Animal {

    // Method overriding: Cat has its own way of saying hello
    @Override
    public void sayHello() {
        System.out.println("Meow");
    }
}

