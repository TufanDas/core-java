package innerClasses.memberInnerClass;

public class TestMemberClass {
    public static void main(String[] args) {
        // Create a Car object with model "Tata Safari"
        Car car = new Car("Tata Safari");

        // Create an Engine object from the Car object using its inner class
        Car.Engine engine = car.new Engine();

        // Start the engine
        engine.start();

        // Stop the engine
        engine.stop();
    }
}

