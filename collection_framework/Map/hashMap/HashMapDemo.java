package collection_framework.Map.hashMap;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>(); // un-order kay va lue
        map.put(1,"Tufan Das");
        map.put(2,"Pawan Das");
        map.put(3,"Rajat Sutradhar");
        map.put(31,"Subham");

        System.out.println(map.get(1));
        System.out.println(map.get(3));
        System.out.println(map.get(30));

        System.out.println(map.containsKey(11)); //false
        System.out.println(map.containsValue("Tufan Das")); // true
        
        for(int key: map.keySet()){
            System.out.println(key +" : "+ map.get(key));
        }

        Collection<String> values = map.values();
        for(String names: values){
            System.out.println(names);
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer, String> entry : entries){
            entry.setValue(entry.getValue().toUpperCase());
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        String removeValue = map.remove(31);
        System.out.println(removeValue);

        boolean removed = map.remove(3, "Rohan Lama"); // not found so false
        System.out.println("isREmoved ? : " + removed);
    }

    /*
    * unordered:
    * allow null keys and value:
    * Not Synchronous: not thread safe
    * Performance: O(1)*/

    /*Internal Structure of hashMap
    * 4-Basic component: key, value, bucket(array), hash function
    * hash function : take a value as input and return a fixedsize string of bytes typically a numerical value
    *                  - deterministic:same input will produce same output
    *                  - Fixed output size(32 or 64 bits)
    *                  - Efficient Computetion: super quick hash function
    * */
}
