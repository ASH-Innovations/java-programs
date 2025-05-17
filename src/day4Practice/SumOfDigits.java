package day4Practice;

public class SumOfDigits {
	public static void sumOfDigits(int number) {
		int sum = 0;
		while (number != 0) {
			int number1 = number % 10;
			sum += number1;
			number = number / 10;

		}
		System.out.println(sum);

	}

	public static void main(String[] args) {
		sumOfDigits(12);
	}

}
