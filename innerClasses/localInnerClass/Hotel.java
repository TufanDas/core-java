package innerClasses.localInnerClass;

public class Hotel {

    private String name;          // Name of the hotel
    private int totalRooms;       // Total number of rooms in the hotel
    private int reservedRooms;    // Number of rooms already reserved

    // Constructor to initialize hotel details
    public Hotel(String name, int totalRooms, int reservedRooms) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }

    // Method to reserve rooms for a guest
    public void ReservedRoom(String guestName, int numOfRooms) {

        // Local inner class for validating reservation inputs
        class ReservationValidator {

            // Method to validate all the reservation conditions
            boolean validate() {
                if (guestName == null || guestName.isBlank()) {
                    System.out.println("Guest Name cannot be empty.");
                    return false;
                }
                if (numOfRooms < 0) {
                    System.out.println("Number of rooms should be positive.");
                    return false;
                }
                if (reservedRooms + numOfRooms > totalRooms) {
                    System.out.println("Not enough rooms are available.");
                    return false;
                }

                return true; // All checks passed
            }
        }

        // Create a validator instance
        ReservationValidator validator = new ReservationValidator();

        // Perform validation and update reservation if valid
        if (validator.validate()) {
            reservedRooms += numOfRooms;
            System.out.println("Reservation confirmed for " + guestName + " for " + numOfRooms + " rooms.");
        } else {
            System.out.println("Reservation Failed.");
        }
    }
}
