package day9ProgramsPractice;

public class ReverseString {

	public static void main(String args[]) {
		String reverString = reverseString("ReverseString");
		System.out.println("Reverse String is: " + reverString);

	}

	public static String reverseString(String org_String) {
		System.out.println("Original String is: " + org_String);
		int lengthOfString = org_String.length();
		System.out.println("The length of string is: " + lengthOfString);
		String rev = "";
		for (int i = lengthOfString - 1; i >= 0; i--) {
			rev = rev + org_String.charAt(i);

		}

		return rev;
	}
}
