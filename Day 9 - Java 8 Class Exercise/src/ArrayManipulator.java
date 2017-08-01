import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by mahajani on 7/28/2017.
 */
public class ArrayManipulator {

    int[] array;

    public ArrayManipulator(int[] array) {
        this.array = array;
    }

    public void forEach(Consumer<Integer> consumer) {
        for (int num : array) {
            consumer.accept(num);
        }

    }

    public void modify(java.util.function.Function<Integer, Integer> function) {
        for (int i = 0; i < array.length; i++) {
            array[i] = function.apply(array[i]);

        }
    }

    public int fold(FoldInterface<Integer, Integer> foldInterface) {

        int i = 0;

        for (i = 0; i < array.length - 1; i = i + 1) {
            this.array[i + 1] = foldInterface.accept(this.array[i], this.array[i + 1]);
        }
        return this.array[i];

    }

    public int[] delete(Predicate<Integer> predicate) {

        int[] newArray = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
             if(predicate.test(array[i])){

                 newArray[j] = array[i];
                 j++;
             }
        }
        return newArray;
    }



}

