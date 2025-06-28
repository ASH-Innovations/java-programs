package programsPracticeDay14;

public class SwapTwoNumbersWithThirdVariable {
	public static void swapTwoNumbers(int number1, int number2) {
		System.out.println("Before Swapping: " +number1);
		int temp;
		temp = number2;
		number2 = number1;
		number1 = temp;

		System.out.println(number1);
		System.out.println(number2);

	}
	public static void main(String[] args) {
		swapTwoNumbers(10, 20);
	}

}
