package innerClasses.static_nested_classs;

public class Computer {

    // Fields for basic computer info
    private String brand;
    private String model;

    // a computer "has an" OperatingSystem
    private OperatingSystem os;

    // Constructor to initialize computer details and its operating system
    public Computer(String brand, String model, String osName) {
        this.brand = brand;
        this.model = model;

        // Creating an instance of the inner class OperatingSystem
        os = new OperatingSystem(osName);
    }

    // Getter to expose the OperatingSystem object
    public OperatingSystem getOs() {
        return os;
    }

    // Non-static (member) inner class for Operating System This class can access outer class fields like 'model'

    class OperatingSystem {
        private String osName;

        public OperatingSystem(String osName) {
            this.osName = osName;
        }

        // Display basic info about the OS tied to this computer model
        public void displayInfo() {
            System.out.println("Computer Model " + model + ", OS : " + osName);
        }
    }



    // ----------------------------
    // Static nested class representing a USB device
    // ----------------------------
    static class USB {
        private String type;
        private String name;
        private double price;
        private String color;

        // Constructor for USB device
        public USB(String name, String type, double price, String color) {
            this.name = name;
            this.type = type;
            this.price = price;
            this.color = color;
        }

        // Displaying USB info (kind of like toString() but manual)
        public void displayInfo() {
            System.out.println("USB name  : " + name);
            System.out.println("USB type  : " + type);
            System.out.println("USB price : " + price);
            System.out.println("USB color : " + color);
        }
    }

}
