// 通过继承 Exception 类来创建自定义异常
// 如果使用了抛出异常的方法，要么用 try-catch 语句，要么用 throws xxException 声明。
// [为什么“throws Exception”在调用函数时时必要的?](https://stackoverflow.com/questions/11589302/why-is-throws-exception-necessary-when-calling-a-function)

package exceptions;

class SimpleException extends Exception{}

public class InheritingExceptions {
	public void f() throws SimpleException{
		System.out.println("从 f() 抛出了 SimpleException 异常。");
		throw new SimpleException();
	}
	public static void main(String[] args) {
		InheritingExceptions sed = new InheritingExceptions();
		try {
			sed.f();
		}
		catch (SimpleException e) {
			System.out.println("抓到异常了！");
		}
	}
}
