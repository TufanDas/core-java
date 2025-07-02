package statickeywords.test;

public class Test {

    /*
     * - When something is marked as "static", it belongs to the class itself — not to any specific object.
     * - That means even if you create multiple objects, the static part is shared across all of them.
     *
     * - You can use "static" with variables, methods, blocks, and even nested classes.
     * - It’s mostly used for memory efficiency—so common values don’t get duplicated for every object.
     *
     * - One catch: static methods **cannot** directly access non-static (instance) variables or methods.
     *   Why? Because static methods don’t know which object they belong to.
     * - So, you can’t use `this` or `super` inside a static method—they need an actual object reference.
     */

    public static void main(String[] args) {
        // Creating several student objects
        Student s  = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();

        // We don't call getCount() on any object, we call it on the class itself — because it's static!
        System.out.println(Student.getCount());
    }
}
