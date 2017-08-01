import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by mahajani on 7/25/2017.
 */
public class SetDemo1 {
    static Set<Employee> createList() {
        Set<Employee> employeeList = new HashSet<>();
        Employee employee1 = new Employee(14, "Ishan Mahajan", 4500000, "8310703981", "Software Developer");
        Employee employee2 = new Employee(15, "Aryan Kumar", 5000000, "8390165281", "Software Architect");
        Employee employee3 = new Employee(16, "Sachin Sharma", 7500000, "1410703981", "Software Manager");
        Employee employee4 = new Employee(17, "Kapil Madan", 400000, "9440673981", "Team Lead");
        Employee employee5 = new Employee(16, "Sachin Sharma", 7500000, "1410703981", "Software Manager");

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
//        employeeList.add(employee1);
//  below code doesnt remove the SACHIN object;
// employeeList.remove(new Employee(16, "Sachin Sharma", 7500000, "1410703981", "Software Manager"));
       employeeList.remove(employee1);
        return employeeList;
    }



    static void display(Set<Employee> employeeSet) {
        Iterator<Employee> itr = employeeSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void incrementSalary(Set<Employee> employeeSet) {

        Iterator<Employee> itr = employeeSet.iterator();
        while (itr.hasNext()) {
                Employee emp = itr.next();

            if(emp.getSalary() > 20000) {

                emp.setSalary(emp.getSalary() * 1.2);


            }

        }

    }

    public static void main(String[] args) {
        Set<Employee> employeeList = createList();
//        dispHRA(employeeList);
        display(employeeList);
        incrementSalary(employeeList);
        System.out.println("--------------AFTER INCREMENT--------------");
        display(employeeList);

    }

}

