package day9ProgramsPractice;

public class ReverseStringByAlgorithm {

	public static void main(String[] args) {
		int reverseNumber = reverseNumber(12345123);
		System.out.println(reverseNumber);

	}

	public static int reverseNumber(int number) {

		int rev = 0;
		while (number != 0) {
			rev = rev * 10 + number % 10;
			number = number / 10;

		}

		return rev;

	}
}
