package day10ProgramsPractice;

public class MaxNumberFromAnArray {
	public static void main(String[] args) {

		System.out.println("Execution starts from main method");
		int arr[] = new int[] { 67, 89, 12, 45, 110, 5 };
		int length = arr.length;
		int max = arr[0];
		for (int i = 1; i <= length - 1; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum element is: " + max);
		System.out.println("Execution ended");

	}

}
