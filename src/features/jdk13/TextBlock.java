package features.jdk13;

// jdk13特性：代码块
// Java 13的预览特性（Preview Language Features）
// javac --source 13 --enable-preview Main.java

public class TextBlock {
	public static void main(String[] args) {
		String s = """ 
		           SELECT * FROM
		             users
		           WHERE id > 100
		           ORDER BY name DESC""";
		System.out.println(s);
	}
}
