//类的继承

class Student2{
	String name;
	int age;
	long number;
	Student2(String name, int age, long number) {
		System.out.println("姓名 " + name + "\n年龄 " + age + "\n手机 " + number);
		this.name = name;
		this.age = age;
		this.number = number;
	}
	String test = "I'm Student2";
	void testPrint() {
		System.out.println("I am Student2");
	}
}

class SuperStu extends Student2{
	SuperStu(String name, int age, long number, boolean loveSport){
		super(name,age,number);
		if (loveSport) {
			System.out.println("热爱运动！");
		}
	}
}

class rewriteStu extends Student2{

	rewriteStu(String name, int age, long number) {
		super(name, age, number);
		// TODO Auto-generated constructor stub
	}
	
	String test = "I am rewrite";
	
	void testPrint() {
		System.out.println("I am rewrite");
	}
	
	void print() {
		System.out.println(test);
		System.out.println(super.test);
		testPrint();
		super.testPrint();
	}
}

public class ClassExtend {
	
	public static void main(String[] args) {
//		Student2 stu = new Student2("gym", 21, 21);
//		System.out.println(stu.name);
		SuperStu stu2 = new SuperStu("czc", 19, 23, true);
		
		rewriteStu stu3 = new rewriteStu("aaa", 32, 33);
		stu3.print();
	}
}
