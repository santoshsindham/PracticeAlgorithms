package concurrency.threadPriority;

public class Producer extends Thread {

    @Override
    public void run(){

        for (int i=0; i<6; i++){
            System.out.println("I am producer with:"+i);
            Thread.yield();
        }
    }
}
