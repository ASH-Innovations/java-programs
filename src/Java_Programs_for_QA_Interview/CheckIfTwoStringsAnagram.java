
package Java_Programs_for_QA_Interview;

import java.util.Arrays;

/**
 * This program checks if two strings are anagrams of each other. Two strings
 * are considered anagrams if they contain the same characters in the same
 * frequency.
 */

public class CheckIfTwoStringsAnagram {
	public static void main(String[] args) {
		String str1 = "listen"; // First string
		String str2 = "silent"; // Second string

		if (areAnagrams(str1, str2)) {
			System.out.println("The strings are anagrams.");
		} else {
			System.out.println("The strings are not anagrams.");
		}
	}

	private static boolean areAnagrams(String str1, String str2) {
		// Check if lengths are different
		if (str1.length() != str2.length()) {
			return false;
		}

		// Convert strings to character arrays and sort them
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		// Compare sorted arrays
		return Arrays.equals(charArray1, charArray2);
	}
}
