package oops.polymorphism.compiletimePolymorphism;

public class Calculator {

    // Overloaded add() methods

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(2, 3));           // calls int version
        System.out.println(calc.add(2.5, 3.5));       // calls double version
        System.out.println(calc.add(1, 2, 3));        // calls 3-int version
    }
}