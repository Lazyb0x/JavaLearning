// 多态
// 父类对象指向子对象 只有方法
// 有什么用：接口性，用一个具体的对象去实现，当你想修改时方便修改。
// 比如 List<String> = new ArrayList<String> 可以方便地改成：
// List<String> = new LinkedList<String>
// 弊端：不能使用子类独有的成员属性和子类独有的成员方法

class FatherClass{
	int num = 6;
	public void base() {
		System.out.println("父类普通方法");
	}
	
	public void test() {
		System.out.println("父类被覆盖方法");
	}
	
	public static void stat() {
		System.out.println("父类的静态方法");
	}
}

class ChildClass extends FatherClass {
	int num = 12;
	public String name = "Tom";
	public void test() {
		System.out.println("子类方法");
	}
	public void play() {
		System.out.println("玩耍");
	}
	public static void stat() {
		System.out.println("子类的静态方法");
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		FatherClass po = new ChildClass();
		po.test();
		po.base();
		po.stat();
		System.out.println(po.num);		//6 对象属性不具备多态性
		//System.out.println(po.name);	//不能使用子类独有的属性
		//po.play();					//不能使用子类独有的方法
		System.out.println("------------");
		
		//通过强制转型来使用子类所有的属性和方法
		ChildClass po2 = (ChildClass)po;
		System.out.println(po2.name);
		po2.play();
		po2.stat();
		po2.base();
	}
}
