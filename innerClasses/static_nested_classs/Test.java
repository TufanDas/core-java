package innerClasses.static_nested_classs;

public class Test {
    public static void main(String[] args) {

        // Creating a Computer object with brand, model, and operating system name
        Computer computer = new Computer("HP", "ABC", "XYZ");

        // Printing the OperatingSystem object reference (will print memory address)
        System.out.println(computer.getOs());

        System.out.println();

        // Calling method on the OperatingSystem inner class to print OS details
        computer.getOs().displayInfo();

        // ---------------------------------------
        // Using the static nested USB class
        // ---------------------------------------

        // Creating a USB device with name, type, price, and color
        Computer.USB usb = new Computer.USB("Hp", "type-D", 88.90, "blue");

        // Displaying details of the USB device
        usb.displayInfo();

        System.out.println();

        // Creating another USB device
        Computer.USB usb2 = new Computer.USB("Asus", "type-D", 70.90, "red");

        // Displaying the second USB device's info
        usb2.displayInfo();
    }
}
