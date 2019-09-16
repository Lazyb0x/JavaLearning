package concurrency;

//用 suspend() 或 wait() 方法来暂停线程
//suspend() 和 resume() 被标记"抗议"，以后的 JDK 可能被删除，不要用。
//join() 使异步的线程变成同步执行

class SThread extends Thread{
	public void run() {
		try {
			sleep(3000);
			System.out.println("sleeped 3s.");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class SleepThread extends Thread{
	public boolean flag = true;
	public void run() {
		while (flag) {
			
		}
		System.out.println("thread stopped!");
	}
	public static void main(String[] args) throws Exception {
		SThread st = new SThread();
		st.start();
//		st.join();
		
		SleepThread t2 = new SleepThread();
		t2.start();
		t2.suspend();
		t2.flag = false;
		sleep(5000);
		t2.resume();
	}
}
