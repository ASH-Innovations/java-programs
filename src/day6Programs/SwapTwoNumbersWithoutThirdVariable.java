package day6Programs;

public class SwapTwoNumbersWithoutThirdVariable {

	public static void main(String args[]) {
		System.out.println("Execution starts from main method by JVM");
		int result = swapTwoNumbers(12, 56);
		System.out.println(result);

		System.out.print("Execution ended");

	}

	public static int swapTwoNumbers(int number1, int number2) {
		System.out.println("Before Swapping two numbers: " + number1 + " " + number2);
		int number3;
		number2 = number1;
		number3 = number1;
		number1 = number3;
		System.out.println("After Swapping two numbers: " + number1 + " " + number2);
		return number1 + number2;

	}

}
