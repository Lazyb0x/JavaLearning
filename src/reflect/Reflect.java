package reflect;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.jar.Attributes.Name;

// 反射机制
// jvm 为每一个加载的类都创建了对应的 Class 实例
// 里面保存了该类的所有信息
// 通过 Class 实例获取类的信息的方法称为反射（Reflection）。

public class Reflect {
	//Constructor（构造方法）, Field（成员变量）, Method（方法）

	public static void main(String[] args) {
		
		//类名
		Class mClass = SonClass.class;
		System.out.println("类的名称 " + mClass.getName());
		
		//2.1 获取所有 public 访问权限的变量
	    // 包括本类声明的和从父类继承的
		Field[] fields = mClass.getFields();	//Field是反射中描述成员信息的一个类。
		
		//2.2 获取所有本类声明的变量（不问访问权限）
		 //Field[] fields = mClass.getDeclaredFields();
		
		for (Field field : fields) {
			int modifiers = field.getModifiers();
	        System.out.print(Modifier.toString(modifiers) + " ");	//Modifier Reflect 的 Java语言修饰符 访问权限
	        //输出变量的类型及变量名
	        System.out.println(field.getType().getName()
	                 + " " + field.getName());
		}
	}
}

