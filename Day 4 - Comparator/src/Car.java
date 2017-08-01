/**
 * Created by mahajani on 7/26/2017.
 */
class Car implements Comparable {
    private int id;
    private double price;
    private String brand;


    Car(int id, double price, String brand) {
        this.id = id;
        this.price = price;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Car car = (Car) o;
        return (int) (car.getPrice() - this.getPrice());
    }
}

