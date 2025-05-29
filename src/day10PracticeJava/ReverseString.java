package day10PracticeJava;

public class ReverseString {

	public static String reverseString(String org_String) {
		System.out.println("Original String is: " + org_String);
		int lengthOfOriginalString = org_String.length();
		System.out.println("Length of Original String is: " + lengthOfOriginalString);
		String rev = "";
		System.out.println("Initial value of rev is: " + rev);
		System.out.println("Enter into for loop body");
		for (int i = lengthOfOriginalString - 1; i >= 0; i--) {
			rev = rev + org_String.charAt(i);

		}
		return rev;

	}

	public static void main(String args[]) {
		System.out.println("Execution starts from main method");
		String reverseString = reverseString("Hello Java");
		System.out.println("Reverse String is: " + reverseString);
		System.out.println("Execution has been ended");
	}

}
