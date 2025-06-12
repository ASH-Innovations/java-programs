package collectionsFrameWorkDay3;

import java.util.Vector;
import java.util.Iterator;

public class VectorPractice2 {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();

		// Step 1: Use an array to hold your elements
		String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		// Step 2: Add elements to vector using a loop
		for (String day : days) {
			vector.add(day);
		}

		// Step 3: Use Iterator to print original values
		System.out.println("Original vector:");
		Iterator<String> iterator = vector.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Step 4: Replace full names with abbreviations
		for (int i = 0; i < vector.size(); i++) {
			String s = vector.get(i);
			switch (s) {
				case "Sunday":
					vector.set(i, "Sun");
					break;
				case "Monday":
					vector.set(i, "Mon");
					break;
				case "Tuesday":
					vector.set(i, "Tue");
					break;
				case "Wednesday":
					vector.set(i, "Wed");
					break;
				case "Thursday":
					vector.set(i, "Thu");
					break;
				case "Friday":
					vector.set(i, "Fri");
					break;
				case "Saturday":
					vector.set(i, "Sat");
					break;
				default:
					// Optional
					System.out.println("No abbreviation found for: " + s);
					break;
			}
		}

		// Step 5: Use new iterator to print updated vector
		System.out.println("\nUpdated vector with abbreviations:");
		Iterator<String> updatedIterator = vector.iterator();
		while (updatedIterator.hasNext()) {
			System.out.println(updatedIterator.next());
		}
	}
}
