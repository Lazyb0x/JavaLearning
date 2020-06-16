package concurrency.mythreadpool;

/**
 * 一个简单 Runnable 线程
 * @author Lazyb0x
 *
 */
public class MyTask implements Runnable {

    private static volatile int taskCount = 0;
    private final int id = taskCount++;

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Task " + id + " finished!");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
