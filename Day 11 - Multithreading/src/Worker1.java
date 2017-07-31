class Worker1 extends Thread {

    Runnable task = null;
    int iterations = 0;

    public Worker1(Runnable task, int iterations) {
        this.task = task;
        this.iterations = iterations;
    }

    @Override
    public void run() {
        for (int i = 0; i < iterations ; i++) {
            task.run();
        }
    }
}