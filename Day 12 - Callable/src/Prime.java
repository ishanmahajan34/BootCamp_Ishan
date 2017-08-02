import javax.sql.rowset.CachedRowSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by mahajani on 8/2/2017.
 */
public class Prime implements Callable<Integer> {

    int start, end;

    Prime(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0 ;
        for (int i = start; i < end; i++) {
            sum += i;
        }
        return sum;
    }

    

}
