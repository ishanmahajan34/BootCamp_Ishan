import org.junit.Test;

public class Main {
    @Test
    public void test() {

        Bike bike = new Bike(321,"CBR250",200,2);
        Car car = new Car(982,"HONDA CITY",100,4);

        bike.details();
        bike.drive();
        bike.inspect();
        System.out.println("---------------------------");
        car.details();
        car.drive();
        car.inspect();

    }
}