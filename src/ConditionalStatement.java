
public class ConditionalStatement {
	public static void main(String[] args){
		int a = 25;
		if (a%2==0) {
			System.out.println("a是偶数");
		}
		else {
			System.out.println("a是奇数");
		}
		
		for(int i=0;i<10;i++) {
			System.out.print(i+" \n");
		}
		
		switch(a) {
			case 10:
				System.out.println("我是10");
				break;
			case 20:
				System.out.println("我是20");
				break;
			default:
				System.out.println("其他");
		}
	}
}
