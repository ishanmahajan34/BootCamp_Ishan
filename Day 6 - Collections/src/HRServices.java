import java.util.HashMap;

public class HRServices {

    private static HashMap<Integer,Integer> employeeCredits = new HashMap<>();

    public HRServices() {
    }



    public static void setCredits(int employeeID) {

//        System.out.println(employeeID/10);
        employeeCredits.put(employeeID,employeeID%10);
//        System.out.println(employeeCredits.get(employeeID));
    }

    public static int getCredits(int employeeID) {
        return employeeCredits.get(employeeID);
    }

    public static boolean eligibleForPromotion(int employeeID) {
        if(employeeCredits.get(employeeID)>3 ) {
            return true;
        }
        return false;
    }

    public static void changeProject(int employeeID) {
        if(employeeCredits.get(employeeID) > 3) {
            System.out.println("EMPLOYEE "+employeeID+" WILL BE ASSIGNED A NEW PROJECT");
        }
    }

    public static boolean changeDesignation(int employeeID) {
        if(employeeCredits.get(employeeID) > 3) {
            System.out.println("EMPLOYEE "+employeeID + " IS ELIGIBLE FOR PROMOTION");
            return true;
        }
        return false;
    }
}