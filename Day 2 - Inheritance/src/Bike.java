
class Bike extends Vehicle {

    private int numberOfPeople;

    Bike(int vin, String name, int speed, int numberOfPeople) {
        super(vin, name, speed);
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    void drive() {
        System.out.println("BIKE DRIVE IS VERY COMFORTABLE FOR " + numberOfPeople + " PEOPLE");
    }

    @Override
    void inspect() {
        System.out.println("BIKE DRIVE IS SAFE FOR " + numberOfPeople + " PEOPLE");
    }
}
