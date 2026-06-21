package collectionpack.sets;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		 HashSet<String> fruits = new HashSet<>();

	        fruits.add("Apple");
	        fruits.add("Mango");
	        fruits.add("Banana");
	        fruits.add("Apple");

	        System.out.println("Set: " + fruits);

	        System.out.println("Contains Mango? " + fruits.contains("Mango"));

	        fruits.remove("Banana");

	        System.out.println("After Removal: " + fruits);

	        System.out.println("Size: " + fruits.size());

	}

}