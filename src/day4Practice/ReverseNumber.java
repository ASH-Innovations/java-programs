package day4Practice;

public class ReverseNumber {
	public static void reversNumber(long number) {
		long rev = 0;
		while (number != 0) {
			rev = rev * 10 + number % 10;
			number = number / 10;

		}
		System.out.println(rev);

	}

	public static void main(String[] args) {
		reversNumber(6789012345l);
	}

}
