package features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIDemo {
	    public static void main(String[] args) {

	        List<Integer> numbers = Arrays.asList(
	                10, 20, 30, 40, 50,
	                20, 30, 60, 70, 80
	        );

	        System.out.println("Original List:");
	        System.out.println(numbers);

	        // 1. Filter Even Numbers
	        System.out.println("\nEven Numbers:");
	        numbers.stream()
	               .filter(n -> n % 2 == 0)
	               .forEach(System.out::println);

	        // 2. Numbers Greater Than 40
	        System.out.println("\nNumbers Greater Than 40:");
	        numbers.stream()
	               .filter(n -> n > 40)
	               .forEach(System.out::println);

	        // 3. Square of Numbers
	        System.out.println("\nSquares:");
	        numbers.stream()
	               .map(n -> n * n)
	               .forEach(System.out::println);

	        // 4. Remove Duplicates
	        System.out.println("\nDistinct Numbers:");
	        numbers.stream()
	               .distinct()
	               .forEach(System.out::println);

	        // 5. Sort in Ascending Order
	        System.out.println("\nAscending Order:");
	        numbers.stream()
	               .sorted()
	               .forEach(System.out::println);

	        // 6. Sort in Descending Order
	        System.out.println("\nDescending Order:");
	        numbers.stream()
	               .sorted(Comparator.reverseOrder())
	               .forEach(System.out::println);

	        // 7. Count Elements
	        long count = numbers.stream().count();
	        System.out.println("\nCount = " + count);

	        // 8. Find Maximum Number
	        int max = numbers.stream()
	                         .max(Integer::compare)
	                         .get();

	        System.out.println("Maximum = " + max);

	        // 9. Find Minimum Number
	        int min = numbers.stream()
	                         .min(Integer::compare)
	                         .get();

	        System.out.println("Minimum = " + min);

	        // 10. Sum of All Numbers
	        int sum = numbers.stream()
	                         .reduce(0, (a, b) -> a + b);

	        System.out.println("Sum = " + sum);

	        // 11. Collect Numbers Greater Than 40
	        List<Integer> result =
	                numbers.stream()
	                       .filter(n -> n > 40)
	                       .collect(Collectors.toList());

	        System.out.println("\nCollected List (>40):");
	        System.out.println(result);
	    }
	}

