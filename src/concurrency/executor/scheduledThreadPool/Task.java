package concurrency.executor.scheduledThreadPool;

import java.util.Date;

public class Task implements Runnable {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        System.out.println("Executing task: "+name+" at Date: "+ new Date());
    }
}
