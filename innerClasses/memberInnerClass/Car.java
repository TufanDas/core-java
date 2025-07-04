package innerClasses.memberInnerClass;

public class Car {

    // Private instance variables to hold car model and engine status
    private String model;
    private boolean isEngineOn;

    // Constructor to initialize the car with a model name
    public Car(String name){
        this.model = name;
        this.isEngineOn = false;  // Engine is off by default when car is created
    }

    // Inner class Engine – represents the engine component of the car
    class Engine{

        // Method to start the engine
        void start(){
            if(!isEngineOn){
                isEngineOn = true;  // Turn on the engine
                System.out.println(model + " engine started.");
            } else {
                System.out.println(model + " engine is already on.");
            }
        }

        // Method to stop the engine
        void stop(){
            if(isEngineOn){
                isEngineOn = false;  // Turn off the engine
                System.out.println(model + " engine stopped.");
            } else {
                System.out.println(model + " engine is already off.");
            }
        }
    }
}

