package day5Practice;

public class SwapTwoNumbersUsingThirdVariable {
	public static void main(String args[]) {

		swapTwoNumbers(45, 65);
		System.out.println();

	}

	public static void swapTwoNumbers(int number1, int number2) {
		System.out.println("Before Swapping: " + number1 + " " + number2);

		int number3;
		number3 = number1;
		number1 = number2;
		number2 = number3;
		System.out.println("After Swappint: " + number1 + " " + number2);

	}

}
