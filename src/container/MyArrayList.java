package container;
import java.util.*;

public class MyArrayList {
	
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("AAA");
		l.add("BBB");
		l.add("CCC");
		l.add(1, "DDD");

		l = Arrays.asList("EEE","FFF","GGG");
		
		List<Integer> x = new ArrayList<Integer>();
//		int[] a = {1,2,34,4};
		
//		x = Arrays.asList(a);
		x.add(2);
		x.add(2);
		
		for (int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
		System.out.println(l.toString());
		System.out.println(x.toString());
	}
}
