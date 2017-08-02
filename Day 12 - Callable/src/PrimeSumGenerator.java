import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by mahajani on 8/2/2017.
 */
public class PrimeSumGenerator {
    public static void main(String[] args) throws Exception{
        ExecutorService executor = Executors.newFixedThreadPool(5);
        Future<Integer> future = null;

        int result = 0;

        for (int i = 1; i <= 500; i = i + 100) {

            future = executor.submit(new Prime(i,i+100));
            result += future.get();


        }

        System.out.println(result);
    }
}
