// 从键盘读入字符串

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class KeyboardInput {
	public static void main(String[] args) throws Exception {
		
		// 使用 System.in.read(byte[] b) 读取到字节数组。
		// 这个会和回车符、换行符（'\r','\n'）一起读取，所以长度-2
		//Arrays.equals(a,b) 比较数组相等
		byte b[] = new byte[100];	
		System.out.print("输入：");
		int len = System.in.read(b)-2;
		String s = new String(b,0,len);
		System.out.println(s);
		
		if (s.equals("exit")) {
			System.out.println("退出。");
			return;
		}
		System.out.println("\"" + s + "\"");
		
		// 使用 Scanner(System.in) 来读取。
		// 有 next(), nextline(), nextInt
		Scanner scan = new Scanner(System.in);
		System.out.print("读取一行：");
		String inputl = scan.nextLine();
		System.out.println("\"" + inputl + "\"");
//		String x = scan.next();
//		String y = scan.next();
//		System.out.println(x + " " + y);
		
		
		
	}
}
