import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by mahajani on 7/28/2017.
 */
class EmployeeManager {

    public List<Employee> createEmployeeData(){

        List<Employee> employeeList = new ArrayList<Employee>() ;
        Employee employee1 = new Employee(123,"ISHAN", 40000);
        Employee employee2 = new Employee(98,"ARYAN", 80000);
        Employee employee3 = new Employee(191,"SACHIN", 75000);
        Employee employee4 = new Employee(145,"AKSHAY", 176112);
        Employee employee5 = new Employee(112,"NICK", 121112);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);

        return employeeList;

    }

    public static void main(String[] args) {




        String path = "C:\\Users\\mahajani\\Desktop\\Objects.txt";
        FileOperations fileOperations = new FileOperations();

        EmployeeManager employeeManager = new EmployeeManager();
        List<Employee> employeeList = new ArrayList<>() ;



        employeeList = employeeManager.createEmployeeData();
        Collections.sort(employeeList);
        Iterator<Employee> itr = employeeList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next().getId());
        }


        List<Employee> empSalaryList = new ArrayList<>();
        Collections.sort(employeeList,new EmployeeSalaryComparator());
        Iterator<Employee> itr1 = employeeList.iterator();
        ObjectOutputStream objectOutputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(path);//,true);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
        while (itr1.hasNext()) {
            Employee emp = itr1.next();
            if(emp.getSalary() > 4000) {
                empSalaryList.add(emp);
                //fileOperations.writeToFile(emp,path);
//
                //22222222222222222222222222222222222222


                objectOutputStream.writeObject(emp);
                System.out.println(emp.getName() + "  done !!!");
            }}
                } catch (IOException e) {
//                    e.printStackTrace();
                    System.out.println("6th BREAKPOINT");
                }finally {
                    try {
                        if(objectOutputStream != null) {
                            objectOutputStream.close();
                        }
                        if(fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                    }catch (Exception e) {
                        //e.printStackTrace();

                        System.out.println("5th BREAKPOINT");
                    }
                }
                //22222222222222222222222222222222222222


//        List<Employee> employeeList2 = new ArrayList<>();
        fileOperations.readObjectFile(path);
//        Iterator<Employee> itr4 = employeeList2.iterator();
//        while (itr4.hasNext()) {
//            System.out.println(itr4.next());
//        }

    }

}
