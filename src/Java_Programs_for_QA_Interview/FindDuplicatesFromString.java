package Java_Programs_for_QA_Interview;

public class FindDuplicatesFromString {
	public static void main(String[] args) {
		String str = "programming"; // Input string
		boolean foundDuplicate = false; // Flag to check if duplicates are found
		int duplicateCount = 0; // Counter to count the number of duplicates

		// Check for duplicates
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) { // Compare characters for equality
					System.out.println("Duplicate character found: " + str.charAt(i));
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
