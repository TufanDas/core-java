package CollectionFrameworks;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        System.out.println(list.size());
        list.add(80);
        System.out.println(list.size());
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for(int x: list){
            System.out.println(x);
        }

        System.out.println(list.contains(34));
        System.out.println(list.contains(80));

        list.remove(2);
        list.add(2,500);

        System.out.println(list);

        System.out.println("returning the replaced value : " + list.set(2,250));
        System.out.println(list);
    }
}
