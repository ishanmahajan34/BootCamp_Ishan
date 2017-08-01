import org.junit.Test;

import java.util.ArrayList;


class ThreadingDemo {

    private int var = 0;

    public static void main(String[] args) {
        //int var = 0;
        new ThreadingDemo();
        System.out.println("Finish");


}

     public ThreadingDemo() {

        for (int i = 0; i < 100 ; i++) {
            new Thread (()-> {this.var++;}).start();
            new Thread (()-> {System.out.println(var);}).start();
        }

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
