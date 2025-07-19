package enums;

public class Main {
    public static void main(String[] args) {
//        System.out.println(DayClass.SUNDAY);
//        System.out.println(DayClass.MONDAY);
//        System.out.println(DayClass.TUESDAY);
//        System.out.println(DayClass.THURSDAY);

        System.out.println(Day.SUNDAY);
        System.out.println(Day.MONDAY);
        System.out.println(Day.TUESDAY);
        System.out.println(Day.WEDNESDAY);

        Day monday = Day.MONDAY;
        int ordinal = monday.ordinal( ); // return the index
        System.out.println("index of MONDAY " + ordinal); // print the index

        String name = monday.name();
        System.out.println(name.toLowerCase()); //

        Day enumDay = Day.valueOf("MONDAY");
        System.out.println(enumDay);
        System.out.println();

        Day[] values = Day.values();
        for(Day i: values){
            System.out.println(i);
        }

        Day friday = Day.FRIDAY;
        friday.display();

    }
}
