package concurrency.mythreadpool;

public class ThreadPoolTest {
    public static void main(String[] args){
        MyThreadPool pool = new MyThreadPool(2);

        for (int i=0; i<6; i++){
            pool.execute(new MyTask());
        }

        pool.shutdown();

        System.out.println("Done.");
    }
}
