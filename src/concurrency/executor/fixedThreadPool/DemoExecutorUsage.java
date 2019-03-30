package concurrency.executor.fixedThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoExecutorUsage {

    private static ExecutorService executorService = null;
    private static volatile Future taskOneResults = null;
    private static volatile Future taskTwoResults = null;

    public static void main(String... args){

        executorService = Executors.newFixedThreadPool(2);

        while(true){
            try{
                checkTasks();
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println("Caught exception: "+e.getMessage());
            }
        }
    }

    private static void checkTasks() {

        if (taskOneResults == null || taskOneResults.isDone() || taskOneResults.isCancelled()) {
            taskOneResults = executorService.submit(new TestOne());
        }
        if (taskTwoResults == null || taskTwoResults.isDone() || taskTwoResults.isCancelled()) {
            taskTwoResults = executorService.submit(new TestTwo());
        }
    }
}
