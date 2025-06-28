package programsPracticeDay14;

import java.util.*;

public class PalindromeWithCollectionsFrameWork {

	public static void main(String[] args) {
		reverString();
	}

	public static void reverString() {
		String org_String = "ASA";

		List<Character> arrayList = new ArrayList<>();
		//Convert String to charArray and pass to collection

		for (Character value : org_String.toCharArray()) {
			arrayList.add(value);
		}
		
		//Reverse the collection of characters

		List<Character> reverseList = new ArrayList<>(arrayList);
		Collections.reverse(reverseList);
		System.out.println("Reversed List: " + reverseList);
		
		//Converting back the collection of reversed characters to String

		StringBuffer stringBuilder = new StringBuffer();
		for (Character s : reverseList) {
			stringBuilder.append(s);
		}

		// Correct comparison
		if (stringBuilder.toString().equals(org_String)) {
			System.out.println(org_String + " is a palindrome");
		} else {
			System.out.println(org_String + " is not a palindrome");
		}
	}
}
