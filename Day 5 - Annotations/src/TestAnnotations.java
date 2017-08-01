/**
 * Created by mahajani on 7/25/2017.
 */

@Timestamp(day = Day.FRI,month = Month.APR,year = Year.Y2015)
public class TestAnnotations {
    static int date = 31;

    public int getDate() {
        return date;
    }

    @Company(name = "IBM" , location = "PUNE")
    static public void display() {
        System.out.println("Date today is " + date);
    }
    public static void main(String[] args) {
        display();

    }
}
