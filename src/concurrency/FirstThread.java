package concurrency;

//基本的线程创建:通过继承 Thread 类创建线程

class Thread1 extends Thread{
	public Thread1() {
	}
	
	public Thread1(String name) {
		super(name);
	}
	public void run() {
		System.out.println("this.getName() : " + this.getName());
		System.out.println("getName() : " + getName());
		System.out.println("Thread.currentThread().getName() : " + Thread.currentThread().getName());
//		for(int i=0;i<20;i++) {
//			System.out.println(this.getName() + " : " + i);
//		}
	}
}

public class FirstThread {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Thread1 thread1 = new Thread1("hello");
		Thread1 thread2 = new Thread1();
//		thread1.setName("sdafghdi");;
		thread1.start();
		thread2.start();
	}
}
