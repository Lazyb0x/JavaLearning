package student;

public class SyntacticSugar {
	
	public static void main(String[] args) {
		Integer a = Integer.valueOf(2);
		a = 5;
		int[] b = {2,4,2,4,6,7,5,64,9};
		for (int i : b) {
			System.out.println(i);
		}
		System.out.println(a);
	}
}
