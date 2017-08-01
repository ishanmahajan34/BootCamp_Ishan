import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by mahajani on 7/26/2017.
 */
class CarManager {

     static Set<Car> createCarsData(CarIdComparator carIdComparator){
        Set<Car> carSet = new TreeSet<>(carIdComparator);
        carSet.add( new Car(11, 10, "Suzuki"));
        carSet.add(new Car(12, 56, "Hyundau"));
        carSet.add(new Car(13, 98, "Volvo"));
        carSet.add(new Car(14, 4, "BMW"));
        carSet.add(new Car(15, 34, "Ford"));
        return carSet;
    }

    static Set<Car> createCarsData(CarNameComparator carNameComparator){
        Set<Car> carSet = new TreeSet<>(carNameComparator);
        carSet.add( new Car(11, 10, "Suzuki"));
        carSet.add(new Car(12, 56, "Hyundau"));
        carSet.add(new Car(13, 98, "Volvo"));
        carSet.add(new Car(14, 4, "BMW"));
        carSet.add(new Car(15, 34, "Ford"));
        return carSet;
    }

    public static void main(String[] args) {
//        CarIdComparator
        Set<Car> carSet = createCarsData(new CarNameComparator());
        Iterator itr = carSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("---------------------------------------");

        Set<Car> carSet2 = createCarsData(new CarIdComparator());
        Iterator itr2 = carSet2.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }


    }


}

