package day7ProgramsPractice;

public class FindMinElementFromAnArray {
	public static void main(String[] args) {
		int arr[] = { 12, 34, 56, 89 };
		int minElement = minElementFromAnArray(arr);
		System.out.println("Minimum Element from an array is: " + minElement);

	}

	public static int minElementFromAnArray(int arr[]) {
		int length = arr.length;
		System.out.println("The length of an array is: " + length);
		int min = arr[0], sumEven = 0, sumOdd = 0;
		System.out.println("Initial Value of min is: " + min);
		System.out.println("Initial Value of sumEven is: " + sumEven);
		System.out.println("Initial Value of sumOdd is: " + sumOdd);
		if (arr == null || length == 0) {
			throw new RuntimeException("Array must not be empty ");
		}
		for (int i = 0; i <= length - 1; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println("The element " + arr[i] + " is even");
				sumEven += arr[i];
			} else {
				System.out.println("The element  " + arr[i] + " is odd");
				sumOdd = sumOdd + arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Sum of even numbers are " + sumEven);
		System.out.println("sum of odd number are: " + sumOdd);

		return min;
	}

}
