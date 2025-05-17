package day5Practice;

public class SwapTwoNumbersWithoutThirdVariable {

	public static void main(String args[]) {

		System.out.println("Execution starts from main method by JVM");
		swapTwoNumbersWithOutThirdVariable(90, 80);

		System.out.println("Execution has ended ");

	}

	public static void swapTwoNumbersWithOutThirdVariable(int number1, int number2) {
		System.out.println("Before Swapping: " + number1 + " " + number2);
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		System.out.println("After Swapping: " + number1 + " " + number2);

	}

}
