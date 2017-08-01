/**
 * Created by mahajani on 7/28/2017.
 */
public class CalculationsMain {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.operation(2,5,(int num1, int num2) -> {
            System.out.println(num1 + num2);
            return num1;
        });

    }
}
