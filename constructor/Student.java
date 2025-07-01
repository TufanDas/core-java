package constructor;

class Student {

    // Instance variables to hold student data
    private String name;
    private int rollNumber;
    private int age;

    // Default constructor – sets a default age
    public Student() {
        this.age = 10; // Age is set to 10 if no value is provided
    }

    // Constructor with all properties – allows full initialization
    public Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    // Constructor with only name – other fields remain uninitialized (age, rollNumber will be 0)
    public Student(String name) {
        this.name = name;
        // age and rollNumber will use their default values (0)
    }

    // Setter for age with basic validation
    public void setAge(int x) {
        if (x < 0) {
            System.out.println("Invalid age, please enter a valid age.");
        } else {
            this.age = x;
        }
    }

    // Getter for age
    public int getAge() {
        return this.age;
    }

    // Setter for  name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return this.name;
    }

    // Setter for roll number
    public void setRollNumber(int roll) {
        this.rollNumber = roll;
    }

    // Getter for roll number
    public int getRollNumber() {
        return this.rollNumber;
    }
}