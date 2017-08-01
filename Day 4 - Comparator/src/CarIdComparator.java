import java.util.Comparator;

/**
 * Created by mahajani on 7/26/2017.
 */
class CarIdComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return (o2.getId() - o1.getId());
    }
}
