/**
 * Created by mahajani on 7/29/2017.
 */
public class Employee {
    private int employeeID;
//    private String name;
    private double salary;

    public Employee(int employeeID, double salary) {
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", salary=" + salary +
                '}';
    }
}
