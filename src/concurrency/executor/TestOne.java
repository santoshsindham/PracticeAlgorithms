package concurrency.executor;

public class TestOne implements Runnable {

    @Override
    public void run() {

        while(true){
            System.out.println("Executing task one");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
