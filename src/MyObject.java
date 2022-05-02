class my
{	public static int i;
	public my()
	{
		i++;
	}
	
	public static void print() {		//关键字"static"的作用在于可在没有创建对象的情况下来使用 方法/变量 ，而这些变量是共享的。
		System.out.println("initialization");
	}
	
	{
	    print();
	}
}

class Student{
	public String name;
	private int num;
	
	public Student(String s){
		this.name = s;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public void printInfo() {
		System.out.println(name + " : " + num);
	}
}

public class MyObject {

	public static void testprint() {
		System.out.println("this is a test");
	}
	
	public static void main(String[] args) {
		my x = new my();
		System.out.println(x.i);
		my y = new my();
		System.out.println(y.i);
		my.print();
		
		MyObject newObject = new MyObject();
		MyObject.testprint();
		
		Student stu = new Student("Liming");
		stu.setNum(123);
		stu.printInfo();
	}
}
