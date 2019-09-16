package student;

public class Student extends Human {
	private int id;
	private int number;
	public Student() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public Student(String name,int id,int number) {
		super(name);
		this.id=id;
		this.number=number;
		
	}
	
	public static void main(String[] args) {
		Student stu = new Student("Liming",5,9);
		
		System.out.println(stu.name+" "+stu.id+" "+stu.number);
	}
}
