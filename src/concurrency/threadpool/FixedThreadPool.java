// FixedthreadPool 使用了有限的线程集来执行提交的任务
// 能够控制线程数量，使得并行运行的线程数最大为n
package concurrency.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import concurrency.LiftOff;

public class FixedThreadPool {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newFixedThreadPool(3);
		for (int i=0; i<6; i++) {
			exec.execute(new LiftOff());
		}
		exec.shutdown();
	}
}
