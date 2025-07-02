package statickeywords.test;

public class Student {

    // This is a static variable, shared across all instances of Student.
    // Every time we create a new Student, this will be incremented.
    private static int count = 0;

    // These are instance variables — each Student object gets its own copy.
    private int id;
    private String name;
    private int age;

    // Static method to access the static count variable.
    // We can call this without needing any Student object.
    public static int getCount() {
        return count;
    }

    // Static block runs once — when the class is first loaded.
    // Typically used to initialize static variables or do setup work.
    // It’s also often used in Singleton design pattern setups.
    static {
        System.out.println("Static block: used to initialize static attributes or setup shared logic.");
        System.out.println("Often used in patterns like Singleton where setup happens only once.");
    }

    // Constructor: runs every time a new Student object is created.
    // Each time, we increase the shared count to track total objects.
    public Student() {
        count++;
    }

    // Below are regular getter and setter methods
    // These help us access and update the private instance variables.

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
