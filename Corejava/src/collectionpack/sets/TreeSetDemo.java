package collectionpack.sets;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		 TreeSet<Integer> ts = new TreeSet<>();

	        ts.add(40);
	        ts.add(10);
	        ts.add(30);
	        ts.add(20);

	        System.out.println(ts);

	        System.out.println("First: " + ts.first());

	        System.out.println("Last: " + ts.last());

	        System.out.println("Higher than 20: " + ts.higher(20));

	        System.out.println("Lower than 30: " + ts.lower(30));

	}

}