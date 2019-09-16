
public class MathTest {
	public static void main(String args[])
	{
		int a = 13, b = 12, c = 5;
		double p = (a+b+c)/2;
		double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
		System.out.println(S);
	}
}
