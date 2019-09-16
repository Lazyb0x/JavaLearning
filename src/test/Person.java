package test;

public class Person {
	
	public static int test(int x) {
		x++;
//		System.out.println("x=" + x);
		test(x);
		return x;
	}
	
	public static void main(String[] args) throws Exception{
		System.out.println("hello");
	}
}
