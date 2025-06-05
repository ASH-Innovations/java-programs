package day10ProgramsPractice;

import java.util.*;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		System.out.println("Execution starts from main method");
		Scanner scanner = new Scanner(System.in);
		int enterNumber1 = scanner.nextInt();
		int enterNumber2 = scanner.nextInt();
		System.out.println("Before Swapping " + enterNumber1 + " && " + enterNumber2);

		enterNumber1 = enterNumber1 + enterNumber2;
		enterNumber2 = enterNumber1 - enterNumber2;
		enterNumber1 = enterNumber1 - enterNumber2;
		System.out.println("After Swapping " + enterNumber1 + " && " + enterNumber2);

		System.out.println("Execution ended");
	}

}
