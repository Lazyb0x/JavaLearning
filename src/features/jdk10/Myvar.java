package features.jdk10;

//用 var 来省略变量类型，由编译器自动判断。
// jdk10

public class Myvar {
	public static void main(String[] args) {
		var x = new String("hello var");
		System.out.println(x);
	}
}
