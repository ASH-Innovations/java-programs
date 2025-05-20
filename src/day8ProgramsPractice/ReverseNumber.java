package day8ProgramsPractice;

public class ReverseNumber {
	public static void reverseNumber(int number) {
		int rev = 0;
		while (number != 0) {
			rev = rev * 10 + number % 10;
			number = number / 10;

		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		reverseNumber(678);
	}
}
