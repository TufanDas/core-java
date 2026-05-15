package collection_framework.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        List<String> arrList = Arrays.asList("Tufan", "Pawan"); // returns static length list cnnot insert and delete element, can replace element
        System.out.println(arrList);

        List<Integer> integersList = List.of(1, 2, 3, 4, 5); // un-modifyable list cannot set element

        list.add(1);
        list.add(5);
        list.add(45);

        System.out.println(list.get(2));
        System.out.println("The size of the List is : " +   list.size());

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        for(int x:list){
            System.out.println(x);
        }

        System.out.println(list.contains(5));
        System.out.println(list.contains(53));

        list.remove(2);// remove the 2-nd element
        list.add(2, 20);
        System.out.println(list);

        list.set(2, 40);
        System.out.println(list);
    }
}