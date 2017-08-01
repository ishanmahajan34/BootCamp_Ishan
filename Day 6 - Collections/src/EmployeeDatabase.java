import java.util.ArrayList;
import java.util.List;

/**
 * Created by mahajani on 7/25/2017.
 */
class EmployeeDatabase {

    Employee employee1 = new Employee(14,"Ishan Mahajan", 4500000,"8310703981", "Software Developer");
    Employee employee2 = new Employee(15,"Aryan Kumar", 5000000,"8390165281", "Software Architect");
    Employee employee3 = new Employee(16,"Sachin Sharma", 7500000,"1410703981", "Software Manager");
    Employee employee4 = new Employee(17,"Kapil Madan", 400000,"9440673981", "Team Lead");

    List<Employee> employeeList = new ArrayList<>();


    public List<Employee> creeateEmployeeDatabse(){


        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        return employeeList;
    }



}
