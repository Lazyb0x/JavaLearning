package concurrency;

//从 runnable 接口创建线程

class MyRunnable implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

public class ThreadFromRunnable {
	public static void main(String[] args) {
		MyRunnable r1 = new MyRunnable();
		Thread t1 = new Thread(r1, "runnable");
		t1.start();
	}
}
