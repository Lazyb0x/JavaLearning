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
