
package Java_Programs_for_QA_Interview;

import java.util.*;

public class CountwordOccuranceFromStringWithCollections {
	public static void main(String[] args) {
		String str = "hello world hello everyone"; // Input string
		Map<String, Integer> wordCountMap = new HashMap<>(); // Create a map to store word counts

		// Count occurrences of each word in the string
		countWordOccurrences(str, wordCountMap);

		// Print the word counts
		printWordCounts(wordCountMap);
	}

	// Split the string into words and count occurrences
	public static void countWordOccurrences(String str, Map<String, Integer> wordCountMap) {
		String[] words = str.split(" "); // Split the string by spaces
		for (String word : words) {
			word = word.toLowerCase(); // Convert to lowercase for case-insensitive counting
			wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1); // Update the count in the map
		}
	}

	// Print the word counts
	public static void printWordCounts(Map<String, Integer> wordCountMap) {
		for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue()); // Print each word and its count
		}
	}
}
