package collectionpack.sets;

import java.util.LinkedHashSet;

public class LinkedHastSetDemo {

	public static void main(String[] args) {
		 LinkedHashSet<String> names = new LinkedHashSet<>();

	        names.add("Nikki");
	        names.add("Kiran");
	        names.add("Mahi");

	        System.out.println(names);

	        names.remove("Kiran");

	        System.out.println("After Removal:");
	        System.out.println(names);

	}

}