package oops.inheritence.singleInheritence;

// Base class representing a generic animal
class Animal {
    private String name = "Rob"; // Default name
    private int age;             // Age not initialized, default is 0

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

    // General behavior: All animals eat
    public void eat() {
        System.out.println("This animal eats food.");
    }

    // Placeholder method to be overridden by subclasses
    public void sayHello() {
        System.out.println("");
    }
}
