
public class MyString {
	public static void main(String args[]) {
		String a = new String("You are supposed to destroy them, ");
		a += "not join them!";
		System.out.println(a);
		
		char c = a.charAt(0);			//索引
		System.out.println(c);
		
		String a2 = a.toUpperCase();	//大写
		System.out.println(a2);
		
		String a3 = a.concat(" haha");	//追加
		System.out.println(a3);
		
		System.out.println(a.equalsIgnoreCase(a2));	//比较字符串，忽略大小写
		System.out.println(a.length());	//长度
		
		String a4 = a.replace("destroy", "kill");	//替换
		System.out.println(a4);
		
		String a5 = a.substring(0,3);	//截取 "You"
		System.out.println(a5);
		
		StringBuffer b = new StringBuffer(a);
		b.append(" haha");				//追加
		System.out.println(b);
		
		b.insert(0, "Oh! ");			//插入
		System.out.println(b);
		//b.insert(b.length()-1, "###");
		//System.out.println(b);
		
		b.reverse();					//反转
		System.out.println(b);
		System.out.println(b.toString());
	}
}
