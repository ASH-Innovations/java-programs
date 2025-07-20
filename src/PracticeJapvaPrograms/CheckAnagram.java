
package PracticeJapvaPrograms;

import java.util.Arrays;

public class CheckAnagram {
	public static void main(String args[]) {
		String str1 = "Listen";
		String str2 = "Silent";
		if (isAnagram(str1, str2)) {
			System.out.println("The strings are anagrams.");
		} else {
			System.out.println("The strings are not anagrams.");
		}
	} // Closing brace for main method

	public static boolean isAnagram(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false; // Not anagrams if lengths differ
		}
		// Convert strings to lower case
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		// Compare sorted arrays
		return Arrays.equals(charArray1, charArray2);
	}
}
