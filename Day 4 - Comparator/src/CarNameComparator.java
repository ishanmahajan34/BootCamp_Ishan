import java.util.Comparator;

/**
 * Created by mahajani on 7/26/2017.
 */
class CarNameComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return (o1.getBrand().compareToIgnoreCase(o2.getBrand()));
    }
}
