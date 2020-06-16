package concurrency.mythreadpool;

import java.util.LinkedList;
import java.util.List;

// 手写简单线程池
// 参考自：https://juejin.im/post/5c34229851882525ab6af64c

public class MyThreadPool {
    // 线程中允许的最大线程数
    private static int MAXTHREADNUM = Integer.MAX_VALUE;

    // 未指定时的默认线程数
    private int threadNum = 6;

    // 线程队列
    private List<Runnable> queue;

    // 工作队列
    private WorkThread[] workThreads;

    // 在执行中的任务的数量
    private volatile int runningTaskNum = 0;

    public MyThreadPool(int threadNum) {
        this.threadNum = threadNum;
        threadNum = threadNum > MAXTHREADNUM ? MAXTHREADNUM : threadNum;
        this.queue = new LinkedList<>();
        this.workThreads = new WorkThread[threadNum];
        init();
    }

    private void init() {
        for (int i = 0; i < threadNum; i++) {
            workThreads[i] = new WorkThread();
            workThreads[i].start();
        }
    }

    public void execute(Runnable task) {
        synchronized (queue) {
            queue.add(task);
            // 唤醒所有在等待队列的线程
            queue.notifyAll();
        }
    }

    public void shutdown(){
        // 如果队列中还有任务，或者还有在运行中的任务，就等待
        while(!queue.isEmpty() || runningTaskNum !=0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i=0; i<threadNum; i++){
            workThreads[i].cancel();
            workThreads[i] = null;
        }
        queue.clear();
    }

    private class WorkThread extends Thread {

        private volatile boolean on = true;

        @Override
        public void run() {
//            super.run();
            Runnable task = null;

            try {
                while (on && !isInterrupted()) {
                    synchronized (queue) {

                        while (on && !isInterrupted() && queue.isEmpty()) {
                            queue.wait();
                        }
                    }

                    if (on && !isInterrupted() && !queue.isEmpty()) {
                        task = queue.remove(0);
                    }

                    if (task != null) {
                        runningTaskNum++;
                        task.run();
                        runningTaskNum--;
                    }
                }


            } catch (InterruptedException e) {
//                e.printStackTrace();
            }

            // 任务结束后手动置空
            task = null;
        }

        public void cancel() {
            on = false;
            interrupt();
        }
    }
}
