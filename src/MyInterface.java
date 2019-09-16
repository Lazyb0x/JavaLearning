//接口
//类似于 C++ 的函数声明，然后在继承的类中声明具体的方法。
//一个子类可以继承多个父类

interface if1{
	int ax = 100;
	int bx = 100;
	int add(int a, int b);
}

interface if2{
	int sub(int a, int b);
}

class Calc implements if1, if2{
	public int add(int a, int b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
}

class Test implements if1{
	public int add(int a,int b) {
		return a+b+ax;
	}
		
}

public class MyInterface {
	public static void main(String[] args) {
		Calc c = new Calc();
		int x = c.add(1, 2);
		int y = c.sub(3, 1);
		System.out.println(x);
		System.out.println(y);
		
		Test test = new Test();
		System.out.println(test.add(1, 2));
	}
}

