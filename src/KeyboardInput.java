import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class KeyboardInput {
	public static void main(String[] args) throws Exception {
		InputStream input = System.in;
		Scanner scan = new Scanner(System.in);
		
		byte b[] = new byte[100];
		byte exit[] = "exit".getBytes();
		
		while(true) {
			System.out.print("输入：");
			String inputl = scan.nextLine();
//			int len = input.read(b);
//			if (Arrays.equals(b, exit)) {
//				System.out.println("sdfsdaf");
//			}
//			System.out.println("内容：" + "\"" + new String(b,0,len) + "\"" + new String(exit,0,exit.length));
			if (inputl.equals("exit")) break;
			System.out.println("\"" + inputl + "\"");
		}
	}
}
