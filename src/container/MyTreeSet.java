//TreeSet 会对输入的元素排序，它的底层数据结构是红黑树

package container;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MyTreeSet {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		set.add(9);
		set.add(5);
		set.add(23);
		System.out.println(set);
		
		//用迭代器获取 set 中的元素
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
}
