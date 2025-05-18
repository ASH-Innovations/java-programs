package day6Programs;

public class ReverseStringWithConcateApproach {
	public static void main(String args[]) {
		System.out.println("Execution starts from main method bu JVM");
		String reverseString = reverseString("Sunday");
		System.out.println("Reverse String is: " + reverseString);
		System.out.println("Execution ended");

	}

	public static String reverseString(String org_String) {
		System.out.println("Original String is:  " + org_String);
		int length = org_String.length();
		System.out.println("Length of the String is: " + length);
		String rev = "";
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + org_String.charAt(i);

		}
		return rev;

	}

}
