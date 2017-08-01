import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by mahajani on 7/25/2017.
 */
public class ArrayListDemo {


    static List<Employee> createList() {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 = new Employee(14, "Ishan Mahajan", 4500000, "8310703981", "Software Developer");
        Employee employee2 = new Employee(15, "Aryan Kumar", 5000000, "8390165281", "Software Architect");
        Employee employee3 = new Employee(16, "Sachin Sharma", 7500000, "1410703981", "Software Manager");
        Employee employee4 = new Employee(17, "Kapil Madan", 400000, "9440673981", "Team Lead");
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        return employeeList;
    }

    static void dispHRA(List<Employee> employeeList) {
        Iterator<Employee> itr = employeeList.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next().getSalary() * 0.3);
        }
    }

    public static void main(String[] args) {
        List<Employee> employeeList = createList();
        dispHRA(employeeList);
    }

}
