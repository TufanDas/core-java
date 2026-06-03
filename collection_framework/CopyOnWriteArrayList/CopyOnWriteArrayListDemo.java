package collection_framework.CopyOnWriteArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        // "copy on write" means that whenever a write operation
        // like adding or removing an element
        // instead of directly modifying the exixting list
        // a new copy of the list is created, and modification is aplied to the cpopy
        // This ensure that other threads reading the list while its being modified are unaffected.

        // Read Operation: Fast and direct, since they happen on a stable list without interferencce from modifications.
        // Write operations: a new copy of the list is created for every modification.
        //                   the reference to the list is then updated so that the subsequence reads use this new list.


        // notePAD --> notepad-copy

        // read intensive(more)

//        regular arrayList
//        List<String> shopingList = new ArrayList<>();
        List<String> shopingList = new CopyOnWriteArrayList<String>();
        shopingList.add("Milk");
        shopingList.add("Eggs");
        shopingList.add("Bread");
        shopingList.add("Initial shopping List: " + shopingList);

        for(String item: shopingList){
            System.out.println(item);
            if(item.equals("Eggs")) {
                shopingList.add("Butter");
                System.out.println("Added Butter While REading...");
            }
        }
    //      puran = new
            System.out.println(shopingList);

        System.out.println("-----------------------On Multi Thread------------------------------------------");

//        List<String> sharedList = new ArrayList<>();// cannot possible
        List<String> sharedList = new CopyOnWriteArrayList<>(); //possible
        sharedList.add("Item1");
        sharedList.add("Item2");
        sharedList.add("Item3");

        Thread readerThread = new Thread(()->{
            try {
                    while(true){
//                        Iterate through List
                        for(String  item: sharedList){
                            System.out.println("Reading item: " +  item);
                            Thread.sleep(5000);
                        }
                    }
            }catch (Exception e){
                System.out.println(e);
            }
        });

        Thread writerThread = new Thread(()->{
            try {
                Thread.sleep(5000);
                sharedList.add("Item4");
                System.out.println("Added Item4 to the  List");

                Thread.sleep(5000);
                sharedList.remove("Item1");
                System.out.println("Remove Item1 from the list");
            }catch (Exception e){
//                e.printStackTrace();
                System.out.println(e);
            }
        });
        readerThread.start();
        writerThread.start();
    }
}
