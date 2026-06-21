package collectionpack.sets;

import java.util.ArrayList;
import java.util.List;

public class ArraylistDemo {

	public static void main(String[] args) {
		List al = new ArrayList();
		
		al.add(101);
		al.add(23.45);
		al.add(null);
		al.add(902);
		al.add("Java");
		al.add(true);
		al.add('h');
		
		System.out.println(al);
		
		al.add(905);
		
		System.out.println(al);
		
		al.remove(2);
		System.out.println(al);
		System.out.println(al.get(2));
		
		
		ArrayList<Double> ai = new ArrayList<Double>();
		ai.add(101.32);
		ai.add(201.34);
		ai.add(301.87);
		ai.add(401.726);
		for(double j:ai)
		{
			System.out.println("This is Generics:" +j);
		}
		
	}

}