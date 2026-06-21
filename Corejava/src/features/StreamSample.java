package features;

import java.util.Arrays;
import java.util.List;

public class StreamSample {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(10,33,45,60,22,54);
		
		li.stream().
		filter(n->n%2==0).  //Intermediate
		forEach(System.out::println);  //Method referance operator
		//forEach(n->System.out.println(n)); //terminal Lambda Expression
		
	}

}
