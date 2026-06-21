package collectionpack.sets;

import java.util.*;

public class ComparableDemo {

	public static void main(String[] args) {
		List<Person> ob = new ArrayList<>();
		ob.add(new Person(23,"Alekya"));
		ob.add(new Person(42,"Sai"));
		ob.add(new Person(33,"Shiva"));
		ob.add(new Person(13,"Madhu"));
		
		System.out.println("Before sorting : ");
		for(Person i:ob) {
			System.out.println(i);
		}
		System.out.println("After sorting : ");
		Collections.sort(ob);
		for(Person i:ob) {
			System.out.println(i);
		}
		

	}

}