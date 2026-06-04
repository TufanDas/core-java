package collection_framework.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<k,v> extends LinkedHashMap<k,v> {

    private int capacity;

    public LRUCache(int capacity){
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<k, v> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCache<String, Integer> studentMap = new LRUCache(3);
        studentMap.put("Bob", 99);
        studentMap.put("Alice", 89);
        studentMap.put("Ram", 91);
        studentMap.put("Vipul", 89);


        studentMap.get("Bob");
        System.out.println(studentMap);
    }
}
