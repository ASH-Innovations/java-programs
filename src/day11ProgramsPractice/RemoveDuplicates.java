package day11ProgramsPractice;

import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// You created a list with duplicate elements: "A" appears twice

		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3,1,1));
		/*
		 * You used a LinkedHashSet to remove duplicates and maintain the order in which
		 * elements were added.
		 */
		Set<Integer> unique = new LinkedHashSet<>(list); // maintains order
		/*
		 * Converted the Set back to a List (because List is often needed for indexing
		 * or list-specific operations).
		 */
		list = new ArrayList<>(unique);
		System.out.println(list); // [A, B, C]

	}

}
