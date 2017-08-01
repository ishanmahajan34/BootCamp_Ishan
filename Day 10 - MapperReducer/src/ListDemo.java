import java.util.Arrays;
import java.util.List;

/**
 * Created by mahajani on 7/28/2017.
 */
public class ListDemo {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("ISHAN","SACHIN","ARYAN", "MAHAJAN","AMAN","MANGO");
        list.forEach((String str) -> {
            System.out.println(str.toLowerCase());
        });
    }

}
