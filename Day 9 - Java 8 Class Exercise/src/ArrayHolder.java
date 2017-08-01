import org.junit.Test;

/**
 * Created by mahajani on 7/28/2017.
 */
public class ArrayHolder {

    public static final int[] ARRAY = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};


    @Test
    public void testForEach() {
        ArrayManipulator arrayManipulator = new ArrayManipulator(ARRAY);
        arrayManipulator.forEach((Integer num) -> System.out.println(num));

    }

    @Test
    public void testModify() {
        ArrayManipulator arrayManipulator = new ArrayManipulator(ARRAY);
        arrayManipulator.modify(n -> n * 2);
        arrayManipulator.modify(n -> n + 5);
        arrayManipulator.forEach(num -> System.out.println(num));

    }

    @Test
    public void testFold() {
        ArrayManipulator arrayManipulator = new ArrayManipulator(ARRAY);
        int res = arrayManipulator.fold((num1, num2) -> {
            int result = num1 + num2;
            return result;
        });
        System.out.printf("Sum of array elements : %s%n", res);
    }

    @Test
    public void testDelete() {

        ArrayManipulator arrayManipulator = new ArrayManipulator(ARRAY);
        int[] arrayList = arrayManipulator.delete((Integer num) -> {return num>30;});

//        arrayManipulator.de
        ArrayManipulator arrayManipulator1 = new ArrayManipulator(arrayList);

        arrayManipulator1.forEach(n-> System.out.println(n));
    }



}

