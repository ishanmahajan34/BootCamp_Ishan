import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mahajani on 7/28/2017.
 */
public class FileOperations {

    //error in logic!! rectify!
    public void writeToFile(Object obj, String path) {

        ObjectOutputStream objectOutputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(path,true);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(obj);

        } catch (IOException e) {
            e.printStackTrace();

            System.out.println("4th BREAKPOINT");
        }finally {
            try {
                if(objectOutputStream != null) {
                    objectOutputStream.close();
                }
                if(fileOutputStream != null) {
                    fileOutputStream.close();
                }
            }catch (Exception e) {
                e.printStackTrace();

                System.out.println("5th BREAKPOINT");
            }
         }

    }

//    public List<Employee> readFromFile(String path) {
//
//        ObjectInputStream objectInputStream = null;
//        FileInputStream fileInputStream = null;
//        List<Employee> objectList = new ArrayList<>();
//
//        try {
//            fileInputStream = new FileInputStream(path);
//            objectInputStream = new ObjectInputStream(fileInputStream);
//            objectList.add((Employee)objectInputStream.readObject());
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        finally {
//            try{
//                if(objectInputStream != null) {
//                    objectInputStream.close();
//                }
//                if(fileInputStream != null ) {
//                    fileInputStream.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            return objectList;
//        }
//

//    }

    public void readObjectFile( String path) {

        ObjectInputStream objectInputStream = null;
        FileInputStream fileInputStream = null;
        List<Employee> objectList = new ArrayList<>();
        try {
            fileInputStream = new FileInputStream(path);
            objectInputStream = new ObjectInputStream(fileInputStream);
//            objectList.add((Employee)objectInputStream.readObject());

            Employee emp = (Employee)objectInputStream.readObject();
            System.out.println(emp);
            while (emp != null) {
                emp = (Employee)objectInputStream.readObject();
                System.out.println(emp);
            }

        } catch (IOException e) {
//            e.printStackTrace();

        }
        catch (ClassNotFoundException e) {
            //e.printStackTrace();
            System.out.println("2st BREAKPOINT");
        }finally {
            try{
                if(objectInputStream != null) {
                    objectInputStream.close();
                }
                if(fileInputStream != null ) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                //e.printStackTrace();

                System.out.println("3st BREAKPOINT");
            }
        }


    }
}
