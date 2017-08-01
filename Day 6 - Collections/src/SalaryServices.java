public class SalaryServices {

//    static EmployeeDatabase employeeDatabase = new EmployeeDatabase();

    public static double updateSalary(int employeeID, double salary) {
//        double salary = HRServices.
        if (HRServices.eligibleForPromotion(employeeID)) {

//            employeeDatabase.creeateEmployeeDatabse();
            System.out.println("EMPLOYEE "+employeeID+" IS ELIGIBLE FOR PROMOTION");
            salary += increment(employeeID, salary);
            return salary;

        } else {

            System.out.println("EMPLOYEE "+employeeID+ " ARE NOT ELIGIBLE FOR PROMOTION");
            return salary;
        }

    }

    public static double increment(int employeeID, double salary) {
        if (HRServices.eligibleForPromotion(employeeID)) {
            return salary * (HRServices.getCredits(employeeID) - 3);

        } else {
            return 0.0;
        }
    }

    public static double calculateTDS(double salary) {
        return 0.18 * salary;
    }

//    public static

}