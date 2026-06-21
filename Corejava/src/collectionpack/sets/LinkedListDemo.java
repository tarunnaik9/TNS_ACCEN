package collectionpack.sets;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.addFirst(101);
		li.addFirst('n');
		li.addFirst("hello");
		li.addFirst(104.34);
		li.addLast(201);
		li.addLast(true);
		li.addLast(203);
		li.addLast(204);
		
		System.out.println(li);
		
		//[104,103,102,101,201,202,203,204]
		li.removeFirst();
		System.out.println(li);
		li.removeLast();
		System.out.println(li);
		
	}

}