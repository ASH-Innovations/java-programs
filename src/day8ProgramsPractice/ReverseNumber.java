package day8ProgramsPractice;

public class ReverseNumber {
	public static void reverseNumber(int number) {
		System.out.println("Execution starts from main method by JVM");
		System.out.println("Original Number is: " + number);
		int rev = 0;
		while (number != 0) {
			rev = rev * 10 + number % 10;
			number = number / 10;

		}
		System.out.println("Reverse number is: " + rev);
		System.out.println("Execution starts from main method by JVM");

	}

	public static void main(String[] args) {
		reverseNumber(678);
	}
}
