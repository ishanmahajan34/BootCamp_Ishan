
public class Car extends Vehicle {

    private int numberOfPeople;

    Car(int vin, String name, int speed, int numberOfPeople) {
        super(vin, name, speed);
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    void drive() {
        System.out.println("CAR DRIVE IS VERY COMFORTABLE FOR " + numberOfPeople + " PEOPLE");
    }

    @Override
    void inspect() {
        System.out.println("CAR DRIVE IS SAFE FOR " + numberOfPeople + " PEOPLE");
    }
}