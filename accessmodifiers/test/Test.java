package accessmodifiers.test;
//
import accessmodifiers.school.Student;

public class Test {

    public static void main(String[] args) {

        // Creating a Student object using the public class Student.
        // If Student class had default (package-private) access and was in another package,
        // this would cause a compile-time error. But here it's accessible.
        Student student = new Student();

        // Setting public fields directly (not a best practice, but fine for simple examples).
        student.name = "Tufan Das";
        student.age = 23;

        // Printing the values to the console.
        System.out.println(student.name);

        // Calling a static method from Student class without creating another object.
        Student.satBye();

        // Singleton pattern demonstration:
        // The first call will create the Singleton object.
        System.out.println(SingletonClass.createObject());  // e.g., SingletonClass@e9e54c2

        // The second call will return the same object as the first one.
        System.out.println(SingletonClass.createObject());  // same memory address
    }
}
