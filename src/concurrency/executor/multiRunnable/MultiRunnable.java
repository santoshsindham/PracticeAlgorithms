package concurrency.executor.multiRunnable;

import java.util.List;

public class MultiRunnable implements Runnable {

    List<Runnable> runnables;

    public MultiRunnable(List<Runnable> runnables) {
        this.runnables = runnables;
    }

    @Override
    public void run() {

        for(Runnable runnable : runnables){
            new Thread(runnable).start();
        }
    }
}
