package concurrency.uncaughtExceptionHandler;

public class DemoThreadExample
{
    public static void main(String[] args)
    {
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();
    }
}