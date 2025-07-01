package constructor;

public class Constructor {

    public static void main(String args[]) {

        // Creating student1 using the default constructor
        Student student1  = new Student();
        System.out.println("The default name of student1 is: " + student1.getName()); // name will be null
        System.out.println("The default age of student1 is: " + student1.getAge());   // age = 10 (set by constructor)
        System.out.println("The default Roll Number of student1 is: " + student1.getRollNumber()); // default = 0
        System.out.println();

        // Creating student2 using the full-arguments constructor
        Student student2 = new Student("Tufan Das", 22, 44);
        System.out.println("The name of student2 is: " + student2.getName());
        System.out.println("The age of student2 is: " + student2.getAge());
        System.out.println("The Roll Number of student2 is: " + student2.getRollNumber());
        System.out.println();

        // Creating student3 with only the name constructor
        Student student3 = new Student("Tufan Das");
        System.out.println("The name of student3 is: " + student3.getName());
        System.out.println("The age of student3 is: " + student3.getAge()); // will be 0
        System.out.println("The Roll Number of student3 is: " + student3.getRollNumber()); // will also be 0
    }
}