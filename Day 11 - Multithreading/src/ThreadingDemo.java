import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by mahajani on 7/31/2017.
 */
class ThreadingDemo {


    public static void main(String[] args) {


        Integer var = new Integer(0);
        ValueTask valueTask = new ValueTask(var);
        PrintTask printTask = new PrintTask(var);

//        BlockingQueue<Runnable> taskQueue = new ArrayBlockingQueue<>(5);
//        taskQueue.add(valueTask);
//        taskQueue.add(printTask);
//
//        Worker1 workerThread1 = new Worker1(taskQueue);
//        //Worker2 workerThread2 = new Worker2(taskQueue);
//
//        workerThread1.start();
//        //workerThread2.start();

        Worker1 workerThread1 = new Worker1(valueTask,20);
        Worker2 workerThread2 = new Worker2(printTask,20);
        workerThread1.start();
        workerThread2.start();

//        //Worker2 workerThread2 = new Worker2(taskQueue);
//
//        workerThread1.start();
//        //workerThread2.start();


    }
}

class ValueTask implements Runnable{

    int variable = 0 ;

    public ValueTask(int variable) {
        this.variable = variable;
    }

    @Override
    public void run() {
        variable = variable + 1;
    }
}

class PrintTask implements Runnable{

    int variable = 0 ;

    public PrintTask(int variable) {
        this.variable = variable;
    }

    @Override
    public void run() {
        System.out.println(variable);
    }
}
