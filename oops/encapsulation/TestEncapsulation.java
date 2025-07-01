package oops.encapsulation;

// Main class to demonstrate encapsulation and object interaction
public class TestEncapsulation {
    public static void main(String args[]) {

        // Create and use a Student object
        Student student = new Student();
        student.setAge(-15);  // Try to set an invalid age
        System.out.println(student.getAge());  // Should print 0 if invalid

        // Create and use a BankAccount object
        BankAccount account = new BankAccount();
        account.deposite(100);  // Deposit money
        account.withdraw(1002); // Try to withdraw more than the balance
    }
}

