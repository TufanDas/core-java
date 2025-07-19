package wrapperClass;

public class ClassWrapper {
    public static void main(String[] args) {
        int a = 10; // stack memory
        Integer x = 20; // heap memory

        boolean hasGraphicCard = true;// stack memory
        Boolean isAdult = false; // heap memory

        float e = 45.99f;
        Float f = 56.90f;

        double y = 34.88;
        Double z = 32.6;

        Character c = 'c';
        Byte s = 2;
        Short sh = 9;
        Long l = 12345l;


        /* Integer is a class so it can hold null but int cannot hold null */

//        int val = null; // error
        Integer val2 = null; // store null values;
        System.out.println(Integer.max(23,45));
        System.out.println(Integer.min(23,45));
        System.out.println(Integer.toBinaryString(10));


        Integer obj1 = 10;
        Integer obj2 = 10;
        System.out.println(obj1.equals(obj2)); // true
        System.out.println(obj1 == obj2);// true

    }
}