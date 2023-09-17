package src.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        // 싱글 스레드 방식으로, ExecutorService 는 구현해야할 것들이 너무 많아서,  Executors 모듈을 활용힌디.
        // Executor Service 는 정책을 결정한다. single thread, fixed thread pool, cached thread pool
        // single thread 는 1개, fixed thread 는 제시한 갯수만큼, cached thread 는 등록된 모든 thread 들이 멀티로 동작.

//        singleThreadExecution();
//        fixedThreadExecution();
//        cachedThreadExecution();

    }

    public static void singleThreadExecution(){
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.execute(new Task(1));
        executorService.execute(new Task(2));
        executorService.execute(new Task(3));


        executorService.shutdown();
    }


    public static void fixedThreadExecution(){
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(new Task(1));
        executorService.execute(new Task(2));
        executorService.execute(new Task(3));


        executorService.shutdown();
    }

    public static void cachedThreadExecution(){
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(new Task(1));
        executorService.execute(new Task(2));
        executorService.execute(new Task(3));


        executorService.shutdown();
    }
}
