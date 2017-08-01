import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by mahajani on 7/25/2017.
 */

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.LOCAL_VARIABLE})
@interface Company {
    String name() default "CDK";
    String location() default "PUNE";
}