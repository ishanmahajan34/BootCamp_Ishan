import org.junit.Test;

/**
 * Created by mahajani on 8/2/2017.
 */
public class Prime {
    public boolean isPrime( int num ) {
        for (int i = 2; i <= num/2; i = i + 1) {

            if(num % i == 0 ) {
                return false;
            }
        }
        return true;
    }

}
