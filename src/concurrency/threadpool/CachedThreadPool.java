// 使用 Executor 创建线程池 来管理线程对象。
// CachedThreadPool 运行被提交的所有任务，直到 shutdown() 方法被调用。
// 在 Executor 完成所有任务后退出。

package concurrency.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import concurrency.LiftOff;

public class CachedThreadPool {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i=0; i<5; i++) {
			exec.execute(new LiftOff());
		}
		exec.shutdown();
		System.out.println("------------------");
	}
}
