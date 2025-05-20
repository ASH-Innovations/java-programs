package Day1ObjectOrientedProgram;

/**
 * @author srihari
 *
 *         Method Overloading means declaring multiple methods with the same
 *         name but with different argument types, number of arguments, or their
 *         order (sequence).
 */
public class MethodOverLoading {

	/**
	 * Prints the given integer.
	 * 
	 * @param a an integer value
	 */
	public static void add(int a) {
		System.out.println(a);
	}

	/**
	 * Adds two integers and prints the result.
	 * 
	 * @param a first integer
	 * @param b second integer
	 */
	public static void add(int a, int b) {
		System.out.println(a + b);
	}

	/**
	 * Subtracts long value from int and prints the result.
	 * 
	 * @param b an integer
	 * @param a a long value
	 */
	public static void add(int b, long a) {
		System.out.println(b - a);
	}

	public static void main(String[] args) {
		add(10);
		add(34, 2);
		add(56, 23L); // capital 'L' is preferred for clarity
	}
}
