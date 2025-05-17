package day3Programs;

public class ReverseString {

	public static String reverseString(String org_String) {
		System.out.println("Orginal String is: " + org_String);
		String rev = "";
		int length = org_String.length();
		System.out.println("The lengthof Original String is: " + length);
		for (int i = length - 1; i >= 0; i--) {
			rev += org_String.charAt(i);
		}

		// String
		// gnirtS

		return rev;
	}

	public static void main(String[] args) {
		String reverString = reverseString("String");
		System.out.println("reverse String is: " + reverString);
	}

}
