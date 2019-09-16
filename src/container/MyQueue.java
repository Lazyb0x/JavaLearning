package container;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MyQueue {
	
	public static Comparator<String> stringComparator = new Comparator<String>() {
		@Override
		public int compare(String a, String b) {
			int sgn = 0;
			int la = a.length();
			int lb = b.length();
			int l = Math.min(la, lb);
			for (int i=0;i<l;i++) {
				char ca = a.charAt(i);
				char cb = b.charAt(i);
				if (ca-cb>0) {
					sgn = 1;
				}
				else if (ca-cb<0) {
					sgn = -1;
				}
			}
			if (sgn==0) {
				if (la>lb) sgn = 1;
				else if (la<lb) sgn = -1;
			}
			return -sgn;
		}
	};
	
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>(stringComparator);
		queue.offer("hello");
		queue.offer("bbb");
		queue.offer("ccc");
		queue.offer("aaa");
		queue.offer("aaaa");
		queue.offer("ddd");
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}
}
