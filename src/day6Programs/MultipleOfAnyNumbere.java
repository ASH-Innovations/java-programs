package day6Programs;

public class MultipleOfAnyNumbere {
	public static void main(String[] args) {
		System.out.println("Execution starts from main method by JVM");
		multiplesOfAnyNumber(3, 12);
		System.out.println("Execution Ended");

	}

	/**
	 * @author srihari 
	 * The multiplesOfAnyNumber method will find multiples of any
	 *         and check the multiple is even or not
	 * 
	 * @param factor
	 * @param count
	 */

	public static void multiplesOfAnyNumber(int factor, int count) {
		for (int i = 0; i <= count; i++) {
			int multiple = factor * i;
			System.out.println(factor + "*" + i + "=" + multiple);
			if (multiple % 2 == 0) {
				System.out.println("the multiple " + multiple + "is Even");
			} else {
				System.out.println("the multiple " + multiple + "is Odd");

			}
		}
	}

}
