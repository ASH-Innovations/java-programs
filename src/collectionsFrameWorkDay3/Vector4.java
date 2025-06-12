package collectionsFrameWorkDay3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Vector4 {

	public static void main(String[] args) {
		// You created a list with duplicate elements: "A" appears twice

		List<String> list = new ArrayList<>(Arrays.asList("A", "B", "A", "C"));
		/*
		 * You used a LinkedHashSet to remove duplicates and maintain the order in which
		 * elements were added.
		 */
		Set<String> unique = new LinkedHashSet<>(list); // maintains order
		/*
		 * Converted the Set back to a List (because List is often needed for indexing
		 * or list-specific operations).
		 */
		list = new ArrayList<>(unique);
		System.out.println(list); // [A, B, C]

	}

}
