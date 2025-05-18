package day6Programs;

public class ReverseStringWithCharArray {
	public static void main(String args[]) {
		System.out.println("Execution starts from main method by JVM");
		ReverseStringWithCharArray ref = new ReverseStringWithCharArray();
		String reverseString = ref.reverseString("evening");
		System.out.println("Reverse string is: " + reverseString);
		System.out.println("Execution ended");
	}

	public String reverseString(String originalString) {
		System.out.println("Original String is: " + originalString);
		int lengthOfString = originalString.length();
		System.out.println("Length Of String is: " + lengthOfString);
		String rev = "";
		char ch[] = originalString.toCharArray();
		int lengthOfCharArray = ch.length;
		System.out.println("Length of char Array is: " + lengthOfCharArray);
		for (int i = lengthOfCharArray - 1; i >= 0; i--) {
			rev = rev + ch[i];
		}
		return rev;
		

	}

}
