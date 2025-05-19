package day7ProgramsPractice;

public class FindMaximumElementFromAnArray {

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int result = maxElementFromAnArray(arr);
		System.out.println("Maximum Element from the array is: " + result);
	}

	public static int maxElementFromAnArray(int arr[]) {
		int sumEven = 0, sumOdd = 0, max = arr[0];

		if (arr == null || arr.length == 0) {
			throw new RuntimeException("Array must not be empty");
		}

		System.out.println("The length of the array is: " + arr.length);
		System.out.println("The initial value of max is: " + max);

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				System.out.println("The element " + arr[i] + " is even");
				sumEven += arr[i];
			} else {
				System.out.println("The element " + arr[i] + " is odd");
				sumOdd += arr[i];
			}

			if (arr[i] > max) {
				max = arr[i];
			}

		}

		System.out.println("Sum of all even elements is: " + sumEven);
		System.out.println("Sum of all odd elements is: " + sumOdd);

		return max;

	}

}
