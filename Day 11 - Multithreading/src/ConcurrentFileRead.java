import org.junit.Test;

import java.io.*;

/**
 * Created by mahajani on 7/31/2017.
 */
public class ConcurrentFileRead {

    @Test
    public void testRead(){

        FileRead fileRead1 = new FileRead("C:\\Users\\mahajani\\Desktop\\Movie3.txt");
        FileRead fileRead2 = new FileRead("C:\\Users\\mahajani\\Desktop\\Movie2.txt");
        Worker2 worker2 = new Worker2(fileRead2,20);
        Worker1 worker1 = new Worker1(fileRead1,20);

        worker1.start();
        worker2.start();

    }
}

class FileRead implements Runnable{

    String path = null;

    public FileRead(String path) {
        this.path = path;
    }

    @Override
    public void run() {
        InputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        try{
            File file = new File(path);
            //byte stream
            fis = new FileInputStream(file);
            //char stream
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);

            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(br != null){
                    br.close();
                }
                if(isr != null){
                    isr.close();
                }
                if(fis != null){
                    fis.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
