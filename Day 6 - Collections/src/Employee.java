/**
 * Created by mahajani on 7/25/2017.
 */
public class Employee {
    private int employeeId;
    private String name;
    private double salary;
    private String phone;
    private String designation;

    Employee(int employeeId, String name, double salary, String phone, String designation) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.phone = phone;
        this.designation = designation;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    private void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", phone='" + phone + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    private void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDesignation() {
        return designation;
    }

    private void setDesignation(String designation) {
        this.designation = designation;
    }


}
