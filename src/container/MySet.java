package container;
import java.util.HashSet;
import java.util.Set;

public class MySet {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("hello");
		set.add("nice");
		set.add("hello");
		System.out.println(set);
	}
}
