package concurrency.threadPriority;

public class Consumer extends Thread {

    @Override
    public void run(){

        for(int i=0; i<6; i++){
            System.out.println("I am consumer: item:"+i);
            Thread.yield();
        }
    }
}
