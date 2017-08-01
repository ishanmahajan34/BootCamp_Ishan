/**
 * Created by mahajani on 7/25/2017.
 */
public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee(14,"Ishan Mahajan", 4500000,"8390703981", "Software Developer");
        System.out.println("EMPLOYEE SALARY : "+employee1.getSalary());
        HRServices.setCredits(employee1.getEmployeeId());
        System.out.println("EMPLOYEE SALARY : "+ SalaryServices.updateSalary(employee1.getEmployeeId(),employee1.getSalary()));

    }

}