package collection_framework.Map.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeAndEqualsMethod {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();

        Person p1 = new Person("Alice", 1);
        Person p2 = new Person("Bob", 2);
        Person p3 = new Person("Alice", 1);

        map.put(p1, "Engineer");
        map.put(p2, "Designer");
        map.put(p3, "Manager");

        System.out.println(map.size());
        System.out.println(map.get(p1));
        System.out.println(map.get(p3));

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Subham", 90);
        map1.put("Neha", 92);
        map1.put("Subham", 99);
    }
}

class Person{
    private String name;
    private int id;

    public Person(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(null == obj){
            return false;
        }

        if(getClass() != obj.getClass()){
            return false;
        }

        Person other = (Person) obj;
        return  id == other.getId() && Objects.equals(name, other.getName() );
    }

    @Override
    public String toString() {
        return " id: " + id + " name: " + name;
    }
}