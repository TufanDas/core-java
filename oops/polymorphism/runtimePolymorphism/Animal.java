package oops.polymorphism.runtimePolymorphism;

class Animal {
    // Private fields for each animal's name and age
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return this.name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return this.age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // A general behavior: all animals can eat
    public void eat() {
        System.out.println("This animal eats food.");
    }

    // A generic "sayHello" method - meant to be overridden by subclasses
    public void sayHello() {
        System.out.println("...");
    }
}
