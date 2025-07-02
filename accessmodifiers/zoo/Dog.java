package accessmodifiers.zoo;

public class Dog extends Animal {

    // Constructor: when you create a Dog object, it will always have "Bark" as its sound by default
    public Dog(String name) {
        // Calls the constructor of Animal with name and default sound "Bark"
        super(name, "Bark");
    }

    // Private helper method to get the class name (in this case, "Dog")
    private String getName() {
        return getClass().getSimpleName();
    }

    // Public method: prints a cute action of the dog wagging its tail
    public void wagTail() {
        System.out.println(getName() + " is wagging its tail.");
    }

    // Public method to allow changing the dog's sound
    // Calls the protected method from Animal (accessible because Dog is a subclass)
    public void setDogSound(String newSound) {
        changeSound(newSound);
    }
}

