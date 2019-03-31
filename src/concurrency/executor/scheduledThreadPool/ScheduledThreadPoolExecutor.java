package concurrency.executor.scheduledThreadPool;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecutor {

    public static void main(String... args){

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        Task task1 = new Task("task 1");
        Task task2 = new Task("task 2");

        System.out.println("The time is :"+ new Date());

        executor.schedule(task1, 5, TimeUnit.SECONDS);
        executor.schedule(task2, 10, TimeUnit.SECONDS);

        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}
