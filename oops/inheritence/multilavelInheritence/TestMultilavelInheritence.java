package oops.inheritence.multilavelInheritence;

public class TestMultilavelInheritence {

    public static void main(String[] args) {
        Child child = new Child();
        child.setName("Ram");
        child.setAge(8);
        Parent parent = new Parent();
        parent.setName("Mukesh");
        parent.setAge(30);

        System.out.println("Child's name: " + child.getName());
        System.out.println("Child's age: " + child.getAge());
        child.sayHello();
        child.eat();

        System.out.println("\nParent's name: " + parent.getName());
        System.out.println("Parent's age: " + parent.getAge());
        parent.sayHello();
        parent.eat();
    }
}
