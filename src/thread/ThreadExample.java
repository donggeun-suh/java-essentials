package src.thread;

import java.util.concurrent.Executor;

public class ThreadExample {
    public static void main(String[] args) {

        Executor e = Runnable::run;
        Thread myThread = new Thread(() -> {
            for (int i = 0; i <10 ; i++) {
                System.out.println("1. Thread Running!!");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });

        myThread.start();


        e.execute(() -> {
            for (int i = 0; i <10 ; i++) {
                System.out.println("2. Thread Running!!");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });

    }




}
