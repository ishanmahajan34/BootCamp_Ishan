import org.junit.Test;

import java.util.List;

/**
 * Created by mahajani on 7/29/2017.
 */
public class EmployeeMain {

    EmployeeManager employeeManager = new EmployeeManager();
    List<Employee> employeeList = employeeManager.createEmployeeData();

    @Test
    public void testTDSCalculate() {
        double tdsTotal = employeeList.stream().filter(emp -> emp.getSalary() > 20000).map(tds -> tds.getSalary() * 0.1).reduce((acc, val) -> acc + val).get();
        System.out.println(tdsTotal);
    }

    @Test
    public void testTotalSalary(){
        double totalSalary = employeeList.stream().map(employee -> employee.getSalary()).reduce((acc,val) -> acc + val).get();
        System.out.println("MONTHLY TOTAL SALARY : " + totalSalary/12);
    }

    @Test
    public void testMinimumSalariedEmployee() {
        Employee emp = employeeList.stream().min((x,y)->(int)(x.getSalary()-y.getSalary())).get();
        System.out.println(emp);
    }

    @Test
    public void testMaximumSalariedEmployee() {
        Employee emp = employeeList.stream().max((x,y)->(int)(x.getSalary()-y.getSalary())).get();
        System.out.println(emp);
    }

    @Test
    public void testCountEmployee() {
        long empCount = employeeList.stream().count();
        System.out.println(empCount);
    }
}
