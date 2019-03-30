package concurrency.executor.multiRunnable;

public class TestThree implements Runnable {

    @Override
    public void run() {

        while(true){
            System.out.println("Executing task three.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
