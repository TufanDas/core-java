package finalkeyword;

class Car {

    private static final int speedLimit; // final -> constant cannot assing value second time

    static {
        speedLimit = 200;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }


    // Car-specific acceleration behavior
    public void acclerete() {
        // Logic for accelerating a car
    }

    // Car-specific deceleration behavior
    public void decelerate() {
        // Logic for braking a car
    }

    public final void airBags(){
        System.out.println("4 air bags.");
    }
}