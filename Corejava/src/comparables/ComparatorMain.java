package comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import collectionpack.person;

public class ComparatorMain {

	public static void main(String[] args) {
		List<Person> al = new ArrayList<>();
		al.add(new Person(23,"Alekya"));
		al.add(new Person(42,"Sai"));
		al.add(new Person(33,"Shiva"));
		al.add(new Person(13,"Madhu"));
		
		System.out.println("Before sorting : ");
		for(Person i:al) {
			System.out.println(i);
		}
		System.out.println("After sorting : ");
		Collections.sort(al,new ComparatorName());
		for(Person i:al) {
			System.out.println(i);
		}
		

	}

}