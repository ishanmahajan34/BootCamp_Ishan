import java.util.Comparator;

/**
 * Created by mahajani on 7/28/2017.
 */
public class EmployeeSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return (int)(o1.getSalary() - o2.getSalary());
    }
}
