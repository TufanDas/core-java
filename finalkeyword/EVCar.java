package finalkeyword;

public class EVCar extends Car {

    public void airBags(){ ///  final method cannot be overriden
        System.out.println("2 air bags.");
    }
}
