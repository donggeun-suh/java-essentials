package src.thread;

import java.util.concurrent.TimeUnit;

public class Task implements Runnable{
    int id;


    public Task(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("Task ID: " + id + ", running ... " + i);
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
