package concurrency;

//《thinking in java 4》 21.2.1
public class LiftOff implements Runnable {
	protected int countDown = 10;
	private static int taskCount = 0;
	private final int id = taskCount++;			//每 new 一个对象就 +1
	public LiftOff() {}
	
	public LiftOff(int countDown) {
		this.countDown = countDown;
	}
	
	public String status() {
		return "#" + id + "(" + (countDown>0 ? countDown : "Liftoff!") + ")";
	}
	
	public void run() {
		while(countDown-- > 0) {
			System.out.println(status());
			Thread.yield();			//在 run() 的结尾加 yield() 是必要的吗?
		}
	}
}
