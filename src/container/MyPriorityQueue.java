package container;

import java.util.Comparator;
import java.util.PriorityQueue;

//优先队列

public class MyPriorityQueue {
	public static void main(String[] args) {
		//如果不是基本数据类型，传入一个 Comparator 使其可以比较。
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(intComparator);
		//使用 Lambda 表达式的方法，等效于 pq。
		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>((o1, o2) -> o1-o2);
		
		pq.offer(3);
		pq.offer(2);
		pq.offer(1);
		pq.offer(4);
		
		//队列内的元素是排序好的
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}
	
	public static Comparator<Integer> intComparator = new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			return o1-o2;
		}
	};
}
