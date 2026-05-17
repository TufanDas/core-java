package collection_framework.linkedList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
    Node node1 = new Node();
    Node node2 = new Node();

    node1.data = 10;
    node1.next = node2;

    node2.data = 20;
    node2.next = null;

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat", "Dog", "Fox"));
        System.out.println(animals);

        for(String animal:animals){
            System.out.println(animal);
        }

        // using iterator
        Iterator<String> it = animals.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        for(int i = 0; i< animals.size(); i++){
            System.out.println(animals.get(i));
        }

        // forr each + lamda function
        animals.forEach(obj -> System.out.println(obj));
        animals.forEach(System.out::println); // more short and consise

        // reverse traverse
        Iterator<String> desc = animals.descendingIterator();
        while (desc.hasNext()) {
            System.out.println(desc.next());
        }

    }
}

class Node{
    public int data;
    public Node next;
}
