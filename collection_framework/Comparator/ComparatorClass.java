package collection_framework.Comparator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


class  StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length(); // small length of string come first(asc)
//        return s2.length() - s1.length(); // large length of string come first(desc)

//        "ok"  "bye"
    }
}

class MyComparator implements  Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        /*negetive 01 should come before,  positive 02 should come before*/
        return o2 - o1;
    }
}
public class ComparatorClass {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(1);
        System.out.println(list1);
//        list1.sort(null); // ascending order
//        list1.sort(new MyComparator());
        list1.sort((a,b) -> a-b); // ascending order lamda expression

        System.out.println(list1);


        List<String> words = Arrays.asList("banana", "apple", "date");
        words.sort(new StringLengthComparator());
        System.out.println(words);
    }
}
