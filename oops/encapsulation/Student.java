package oops.encapsulation;


// Represents a student with basic properties and encapsulated access
class Student {

    // Instance variables representing student's data
    private String name;
    private int rollNumber;
    private int age;

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

    // Setter for name
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