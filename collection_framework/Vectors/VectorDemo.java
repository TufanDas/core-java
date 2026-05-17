package collection_framework.Vectors;

import java.util.Vector;

import java.util.Vector;

public class VectorDemo {

    public static void printVector(Vector<Integer> vector, String message) {
        System.out.println("\n" + message);
        System.out.println("Vector Elements : " + vector);
        System.out.println("Size            : " + vector.size());
        System.out.println("Capacity        : " + vector.capacity());
    }

    public static void main(String[] args) {

        // Create
        Vector<Integer> vector = new Vector<>(); // default  capacity 10

        printVector(vector, "After Creating Vector");

        // ---------------- CREATE (INSERT) ----------------

        vector.add(10);
        printVector(vector, "After Adding 10");

        vector.add(20);
        printVector(vector, "After Adding 20");

        vector.add(30);
        printVector(vector, "After Adding 30");

        vector.add(1, 15); // insert at index 1
        printVector(vector, "After Inserting 15 at index 1");

        // ---------------- READ ----------------

        System.out.println("\nREAD OPERATIONS");

        System.out.println("Element at index 0 : " + vector.get(0));
        System.out.println("Element at index 2 : " + vector.get(2));

        // ---------------- UPDATE ----------------

        vector.set(2, 25); // replace element at index 2
        printVector(vector, "After Updating index 2 with 25");

        // ---------------- DELETE ----------------

        vector.remove(1); // remove by index
        printVector(vector, "After Removing element at index 1");

        vector.remove(Integer.valueOf(30)); // remove by value
        printVector(vector, "After Removing value 30");

        // ---------------- EXTRA OPERATIONS ----------------

        System.out.println("\nChecking if vector contains 10 : " + vector.contains(10));

        System.out.println("First Element : " + vector.firstElement());

        System.out.println("Last Element  : " + vector.lastElement());

        // Clear all elements
        vector.clear();
        printVector(vector, "After Clearing Vector");
    }
}
