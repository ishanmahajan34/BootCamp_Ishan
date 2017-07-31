
public abstract class Vehicle {

    private int vin;
    private String name;
    private int speed;

    Vehicle() {
    }

    Vehicle(int vin, String name, int speed) {
        this.vin = vin;
        this.name = name;
        this.speed = speed;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    void details() {
        System.out.println("CAR ID : " + vin);
        System.out.println("CAR NAME : " + name);
        System.out.println("CAR SPEED : " + speed);
    }

    abstract void drive();

    abstract void inspect();

}
