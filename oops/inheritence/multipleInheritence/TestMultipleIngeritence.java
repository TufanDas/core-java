package oops.inheritence.multipleInheritence;

public class TestMultipleIngeritence {

    /*
     * Q1: Can I create the main method inside an interface?
     * Ans: Yes! The main method is static, and Java can run any static method without creating an object.
     *      So, you can define a main method inside an interface for testing or demonstration purposes.
     *
     * Q2: What is the difference between an interface and an abstract class?
     * Ans:
     *  - Abstract classes can have instance variables, constructors, and both abstract and concrete methods.
     *  - Interfaces cannot have instance variables or constructors.
     *  - A class can extend only one abstract class (single inheritance).
     *  - A class can implement multiple interfaces (multiple inheritance).
     */

    /*
     * What did we learn?
     * - What interfaces are and how to define them.
     * - The key differences between abstract classes and interfaces.
     * - How Java achieves multiple inheritance using interfaces.
     *
     * Interfaces in Java can contain:
     * - Constants (public static final)
     * - Abstract methods (implicitly public and abstract)
     * - Static methods
     * - Default methods (with implementation)
     */

    public static void main(String[] args) {
        SmartPhone smartphone = new SmartPhone();

        smartphone.makeCall("8514831736");
        smartphone.endCall();

        smartphone.playMusic();
        smartphone.stopMusic();

        smartphone.takePhoto();
        smartphone.recordVideo();
    }
}

