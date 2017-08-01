import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by mahajani on 7/25/2017.
 */

enum Day {
    MON, TUE, WED, THUR, FRI, SAT, SUN }

enum Month {
    JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC }

enum Year {
Y2015, Y2016, Y2017, Y2018, Y2019, Y2020 }

@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE,ElementType.METHOD, ElementType.LOCAL_VARIABLE})
@interface Timestamp {
    Day day();
    Month month();
    Year year();
}
