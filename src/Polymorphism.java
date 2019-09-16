//多态
//父类对象指向子对象 只有方法

class fatherClass{
	int num = 6;
	public void base() {
		System.out.println("父类普通方法");
	}
	
	public void test() {
		System.out.println("父类被覆盖方法");
	}
}

class childClass extends fatherClass {
	int num = 12;
	public void test() {
		System.out.println("我是子类方法");
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		fatherClass po = new childClass();
		po.test();
		System.out.println(po.num);	//对象属性不具备多态性 6
	}
}
