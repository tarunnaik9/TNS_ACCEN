package collectionpack.queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {

	public static void main(String[] args) {
		 Deque<String> dq = new ArrayDeque<>();

	        dq.addFirst("Java");
	        dq.addLast("Python");
	        dq.addLast("C++");

	        System.out.println(dq);

	        System.out.println("Front Element: " + dq.peekFirst());

	        dq.removeLast();

	        System.out.println("After Removing Last:");
	        System.out.println(dq);

	}

}