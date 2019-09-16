// SingleThreadPool 就像是线程数为 1 的 FixedThreadPool (但是它提供了一种并发保证，其他线程不会并发调用)

package concurrency.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import concurrency.LiftOff;

public class SingleThreadPool {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newSingleThreadExecutor();
		for (int i=0; i<5; i++) {
			exec.execute(new LiftOff());
		}
		exec.shutdown();
	}
}
