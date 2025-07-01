package oops.inheritence.multilavelInheritence;

// Base class (top of the hierarchy)
class Grandparent {
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("Grandparent eats traditional food.");
    }

    public void sayHello() {
        System.out.println("Hello from Grandparent");
    }
}
