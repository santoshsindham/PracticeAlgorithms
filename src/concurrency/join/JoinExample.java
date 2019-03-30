package concurrency.join;

public class JoinExample {

    public static void main(String... args) throws InterruptedException {

        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("first task started");
                System.out.println("sleeping for 2 sec");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t1 = new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("second task completed");
            }
        });

        t.start();
        t.join();
        t1.start();
    }
}
