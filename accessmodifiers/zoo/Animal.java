package accessmodifiers.zoo;

public class Animal {

    // 'name' is private, so it can only be accessed within this class
    private String name;

    // 'sound' is protected, so it can be accessed:
    // - inside this class
    // - in any subclass (even in different packages)
    // - by other classes in the same package
    protected String sound;

    // Constructor: used to initialize 'name' and 'sound' when an object is created
    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    // Public method: available to any class to make the animal produce its sound
    public void makeSound() {
        System.out.println(this.name + " makes sound: " + this.sound);
    }

    // Protected method: can be used by subclasses or classes in the same package to change the sound
    protected void changeSound(String newSound) {
        this.sound = newSound;
    }
}

