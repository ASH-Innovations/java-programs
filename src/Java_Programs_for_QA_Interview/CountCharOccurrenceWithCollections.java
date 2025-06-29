
package Java_Programs_for_QA_Interview;

import java.util.HashMap;
import java.util.Map;

public class CountCharOccurrenceWithCollections {
	public static void main(String[] args) {
		String str = "programming"; // Input string
		Map<Character, Integer> charCountMap = new HashMap<>(); // Map to store character counts

		// Count occurrences of each character
		for (char c : str.toCharArray()) {
			// Use getOrDefault to get the current count of the character (default to 0 if
			// not present)
			// Increment the count by 1 and update it in the map
			charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
		}

		// Print characters and their counts
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			// Iterate through the map and print each character along with its count
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
