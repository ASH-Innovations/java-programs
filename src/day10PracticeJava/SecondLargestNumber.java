package day10PracticeJava;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] nums = { 12, 45, 67, 45, 89, 67, 90, 90 };

		Integer largest = Integer.MIN_VALUE;
		Integer second = Integer.MIN_VALUE;

		for (int num : nums) {
			if (num > largest) {
				second = largest;
				largest = num;
			} else if (num > second && num < largest) {
				second = num;
			}
		}

		if (second == Integer.MIN_VALUE) {
			System.out.println("No second largest number found.");
		} else {
			System.out.println("Second largest number is: " + second);
		}
	}

}
