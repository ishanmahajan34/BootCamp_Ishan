import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by mahajani on 8/2/2017.
 */
public class PrimeSumGenerator {
    public static void main(String[] args) throws Exception{
        ExecutorService executor = Executors.newFixedThreadPool(5);
        Future<Integer> future = null;

        Integer result =  new Integer(0);
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
//        list = Collections.synchronizedList(list);
        int count = 0 ;
        for (int i = 1; i <= 500; i = i + 100) {

            future = executor.submit(new PrimeSum(i,i+100));
            System.out.println("2222222222222244444444444444444444444444444444444422222222222222");
               if(future.isDone()) {
                   System.out.println("2222222222222222222222222222");
                   list.add(future.get());
                   count++;
               }
        }

        Iterator<Integer> itr = list.iterator();

        while (count == 5 ) {
            System.out.println("11111111111111111111111111111");
            while (itr.hasNext()) {
                result += itr.next();
            }
        }

        //System.out.println(result);
    }
}
