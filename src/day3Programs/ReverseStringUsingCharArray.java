
package day3Programs;

import day1Programs.ReverseStringByUsingcharArray;

public class ReverseStringUsingCharArray {
	public String reverseString(String org_String) {
		String rev = "";
		System.out.println("Initial String is: " + rev);
		char ch[] = org_String.toCharArray();
		System.out.println(ch);
		int lengthOfcharArray = ch.length;
		System.out.println("Length of char Array is: " + lengthOfcharArray);
		int lengthOfString = org_String.length();
		System.out.println("Original String is: " + lengthOfString);
		for (int i = lengthOfcharArray - 1; i >= 0; i--) {
			rev += ch[i];

		}

		return rev;

	}

	public static void main(String[] args) {
		String revereString = new ReverseStringUsingCharArray().reverseString("Hey");
		System.out.println("reverse String is: " + revereString);

	}

}
