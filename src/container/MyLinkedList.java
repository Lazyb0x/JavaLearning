package container;

import java.util.LinkedList;

public class MyLinkedList {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		//开头添加的
		list.push("hello");
		list.push("how");
		
		//末尾添加的
		list.add("are");
		list.offer("you");
		list.addFirst("i");
		list.addLast("fine");
		System.out.println(list);
		System.out.println(list.pop());		//开头
		System.out.println(list);
		System.out.println(list.poll());	//开头
		System.out.println(list);
		System.out.println(list.getLast());
		System.out.println(list.peekLast());
	}
}
