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
		set.add(null);			//可以添加空元素
		set.add("test");
		set.remove("test");
		System.out.println(set.contains("hello"));
		System.out.println(set);
		
		//用迭代器获取
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//forEach 语法糖，也是迭代器
		for(String s : set) {
			System.out.println(s);
		}
		
		//用 toArray() 方法返回数组
		String[] strings = set.toArray(new String[0]);
		System.out.println(Arrays.toString(strings));
		
	}
}
