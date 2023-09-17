package src.thread;

import java.util.concurrent.Executor;

public class ExecutorExample {
    public static class ExecutorImpl implements Executor {
        @Override
        public void execute(Runnable command) {

            // 1. run() 하는 것.
            command.run();

            // 2. Thread(command).start()
//            new Thread(command).start();
        }
    }

    public static void main(String[] args) {
        Executor e = new ExecutorImpl();
        e.execute(()->{
            System.out.println("3. Thread Running!!");
        });
    }

}
