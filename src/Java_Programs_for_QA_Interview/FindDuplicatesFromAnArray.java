
package Java_Programs_for_QA_Interview;

public class FindDuplicatesFromAnArray {
	public static void main(String[] args) {
		Integer arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 10 };
		boolean foundDuplicate = false; // Flag to check if duplicates are found
		int duplicateCount = 0; // Counter to count the number of duplicates

		// Check for duplicates
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) { // Compare elements for equality
					System.out.println("Duplicate found: " + arr[i]);
					foundDuplicate = true; // Set flag to true if a duplicate is found
					duplicateCount++; // Increment the duplicate counter
					break; // Avoid counting the same duplicate multiple times
				}
			}
		}

		if (!foundDuplicate) {
			System.out.println("No duplicates found."); // Output if no duplicates exist
		} else {
			System.out.println("Total number of duplicates: " + duplicateCount); // Output the count of duplicates
		}
	}
}
