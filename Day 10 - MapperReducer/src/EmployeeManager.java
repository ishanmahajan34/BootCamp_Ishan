import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mahajani on 7/29/2017.
 */
public class EmployeeManager {
    public static List<Employee> createEmployeeData() {
        List<Employee> employeeList = new ArrayList<>();
        Employee[] empArray = new Employee[50];
        for (int i = 1; i <= 50; i++) {
            empArray[i-1] = new Employee(i*2,i*1000.00);
        }
        employeeList = Arrays.asList(empArray);
        return employeeList;

    }

//    public static void main(String[] args) {
//        List<Employee> employeeList = createEmployeeData();
//        Iterator<Employee> itr = employeeList.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }
//    }

}
