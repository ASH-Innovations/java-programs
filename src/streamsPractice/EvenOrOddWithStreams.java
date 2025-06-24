package streamsPractice;

import java.util.*;
import java.util.stream.Collectors;

public class EvenOrOddWithStreams {


		public static void main(String[] args) {
			Integer arr[] = new Integer[] { 12, 13, 14 };
			List<Integer> al = new ArrayList<>(Arrays.asList(arr));

			// Print all elements
			System.out.println("All Elements:");
			al.stream().forEach(System.out::println);

			// Even numbers
			List<Integer> evenNumbers = al.stream()
				.filter(n -> n % 2 == 0)
				.collect(Collectors.toList());

			System.out.println("Even Numbers: " + evenNumbers);
			int sumEven = evenNumbers.stream().mapToInt(Integer::intValue).sum();

			// Odd numbers
			List<Integer> oddNumbers = al.stream()
				.filter(n -> n % 2 != 0)
				.collect(Collectors.toList());

			System.out.println("Odd Numbers: " + oddNumbers);
			int sumOdd = oddNumbers.stream().mapToInt(Integer::intValue).sum();

			System.out.println("Sum of Even Numbers: " + sumEven);
			System.out.println("Sum of Odd Numbers: " + sumOdd);
		}
	}

	
	


