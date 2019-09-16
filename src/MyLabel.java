//label用来标记跳转，可以从多层循环中跳出来

public class MyLabel {
	public static void main(String[] args) {
		label:
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.println("i=" + i + ", j=" + j);
				if (j>5&&i>2) break label;
			}
		}
	}
}
