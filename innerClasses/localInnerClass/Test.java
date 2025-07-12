package innerClasses.localInnerClass;

public class Test {
    public static void main(String[] args) {
        // Create a hotel instance with name, total rooms = 10, and 5 already reserved
        Hotel hotel = new Hotel("Sunshine Hotel", 10, 5);

        // Try to reserve 5 more rooms for "Tufan"
        // This should succeed because 5 rooms are still available
        hotel.ReservedRoom("Tufan", 5);

        // Try to reserve 1 room for "Pawan"
        // This should fail because all 10 rooms are now booked
        hotel.ReservedRoom("Pawan", 1);
    }
}
