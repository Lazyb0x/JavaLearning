package container;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MySet {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("hello");
		set.add("nice");
		set.add("world");
		set.add("hello");		//不会添加重复元素
		System.out.println(set);
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		String[] strings = set.toArray(new String[0]);
		System.out.println(Arrays.asList(strings));
	}
}
