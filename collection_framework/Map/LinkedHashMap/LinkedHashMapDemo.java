package collection_framework.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
       LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11, .8f, true); // doubly linked list
       linkedHashMap.put("Orange", 10);
       linkedHashMap.put("Apple", 20);
       linkedHashMap.put("Guava", 30);


       linkedHashMap.get("Apple");
       linkedHashMap.get("Guava");

       for(Map.Entry<String, Integer> entry : linkedHashMap.entrySet()){
           System.out.println(entry.getKey() + " : " + entry.getValue());
       }
    /*LibkedHashMap is not thread safe.
    *linked Hash map used the doubly linked list
    * By Default follows the insertion order if access order true then:
    *                            LRU- least recent used principle follows
    * */


    }
}
