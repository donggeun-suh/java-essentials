package src.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorExample {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
        executorService.scheduleWithFixedDelay(new Task(1), 5, 10, TimeUnit.SECONDS);
        executorService.scheduleAtFixedRate(new Task(2), 5, 10, TimeUnit.SECONDS);
        executorService.scheduleAtFixedRate(new Task(3), 5, 10, TimeUnit.SECONDS);
    }
}
