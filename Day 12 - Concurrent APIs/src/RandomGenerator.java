import java.util.Random;
import java.util.concurrent.*;

public class RandomGenerator {

    Random rand = new Random();
    BlockingQueue<Integer> blockingQueue = new LinkedBlockingDeque<>();

    public RandomGenerator(){

        Thread generatorThread = new Thread(()->{

            try {
                while (true){
                    blockingQueue.put(rand.nextInt(100));
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        generatorThread.start();

        new Thread(()-> {
            try {
                while (true){
                    System.out.println(blockingQueue.take());
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

    }


    public static void main(String[] args) {

        new RandomGenerator();
        System.out.println("DONE");

    }



}


