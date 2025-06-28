package programsPracticeDay14;

import java.util.*;

public class PalindromString {
	public static void main(String[] args) {
		String string = "ASA";
		String rev = reverseString(string, "");
		System.out.println(rev);
		if (rev.equals(string)) {
			System.out.println("is palindrome");
		} else {
			System.out.println("Is not palindrome");
		}

	}

	public static String reverseString(String original_String, String rev) {
		for (int i = original_String.length() - 1; i >= 0; i--) {
			rev = rev + original_String.charAt(i);
		}
		return rev;

	}

}
