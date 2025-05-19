package day6Programs;

public class FindMaximumNumberFromAnArray {
	/**
	 * * Finds the maximum element from an array and prints whether each element is
	 * even or odd.
	 * 
	 * @param arr
	 * @return max
	 */
	public static int maxElement(int arr[]) {
		int sumEven = 0;
		int sumOdd = 0;

		int length = arr.length;
		System.out.println("Length of an Array is: " + length);
		if (arr == null || length == 0) {
			throw new RuntimeException("Array must not be empty");
		}
		int max = arr[0];
		System.out.println("Initial value of Max is: " + max);
		for (int i = 0; i <= length - 1; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println("The element " + arr[i] + " is even");
				sumEven += arr[i];

			} else {
				System.out.println("The element " + arr[i] + " is odd");
				sumOdd = sumOdd + arr[i];
			}
			

			if (arr[i] > max) {
				max = arr[i];
			}

		}
		System.out.println("Sum of all Even element is: " + sumEven);
		System.out.println("Sum of all Odd element is: " + sumOdd);
		return max;

	}

	public static void main(String[] args) {

		int maxElement = maxElement(new int[] {89,90,678,908,1});
		System.out.println("Max Element from an Array is:" + maxElement);
	}

}
