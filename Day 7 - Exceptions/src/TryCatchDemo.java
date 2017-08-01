/**
 * Created by mahajani on 7/26/2017.
 */
class TryCatchDemo {

    static void add (int n1, int n2) {

        int n3 = 0;
        try{
            n3 = n1 / n2;

        }
        catch (Exception e) {
            System.out.println(e);
//            add(10,0);
//            e.getStackTrace();
        }

        System.out.println(n3);

    }

    public static void main(String[] args) {
        add(9,0);
    }
}
