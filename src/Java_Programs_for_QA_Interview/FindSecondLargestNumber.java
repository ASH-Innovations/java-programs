
package Java_Programs_for_QA_Interview;

public class FindSecondLargestNumber {
	public static void main(String[] args) {
		Integer arr[] = { 90, 80, 45, 100, 75, 60 };
		int max = arr[0]; // Initialize the largest number with the first element

		// Find the largest number
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) { // Update max if the current element is greater
				max = arr[i];
			}
		}
		System.out.println("The largest number is: " + max);

		// Find the second largest number
		int secondLargest = Integer.MIN_VALUE; // Initialize second largest to the smallest possible value
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < max && arr[i] > secondLargest) { // Check if the current element is less than max and greater
															// than secondLargest
				secondLargest = arr[i]; // Update secondLargest
			}
		}

		// Output the second largest number
		if (secondLargest != Integer.MIN_VALUE) { // Check if a valid second largest number was found
			System.out.println("The second largest number is: " + secondLargest);
		} else {
			System.out.println("There is no second largest number."); // Handle case where no second largest number
																		// exists
		}
	}
}
