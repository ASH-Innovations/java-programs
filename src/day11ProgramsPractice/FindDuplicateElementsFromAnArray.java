package day11ProgramsPractice;

public class FindDuplicateElementsFromAnArray {
	public static void main(String[] args) {
		int array[] = new int[] { 1, 2, 3, 4, 5, 1, 2, 4};
		int length = array.length;
		System.out.println(length);
		boolean flag = false;

		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (array[i] == array[j]) {
					System.out.println("Dup Element is: " + array[i]);
					flag = true;
				}
			}

		}
		if (flag == false)

			System.out.println("No Duplicate elements found");

	}
}
