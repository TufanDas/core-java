package oops.abstraction;


// Cat class also extends Animal and overrides sayHello
class Cat extends Animal {

    // Cat-specific behavior for sayHello
    @Override
    public void sayHello() {
        System.out.println("Meow");
    }
}
