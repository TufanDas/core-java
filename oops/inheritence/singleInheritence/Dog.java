package oops.inheritence.singleInheritence;

// Dog class extends Animal and overrides behavior
class Dog extends Animal {

    // Method overriding: Dog has its own way of saying hello
    @Override
    public void sayHello() {
        System.out.println("woof");
    }
}
