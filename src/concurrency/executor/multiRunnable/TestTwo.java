package concurrency.executor.multiRunnable;

public class TestTwo implements Runnable {

    @Override
    public void run() {

        while(true){
            System.out.println("Executing task two");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
