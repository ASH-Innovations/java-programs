package day6Programs;

public class SwapTwoNumbersWithoutThirdVariable {
	public static int swapTwoNumbers(int number1, int number2) {
		System.out.println("Before Swapping: " + number1 + "" + number2);
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		System.out.println("After Swapping: " + number1 + "" + number2);
		int res = number1 + number2;
		return res;
	}

	public static void main(String[] args) {
		int result = swapTwoNumbers(34, 23);
		System.out.println(result);
	}

}
