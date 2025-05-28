package day4OOPS;

/**
 * We can achive compile time polymorphism by using method overloading 1.declare
 * multiple method and that method names should be same 2.number of parameters
 * should be different 3.data type of parameters should be different 4.Order of
 * parameters should be different
 * 
 * @author srihari
 *
 */

public class MethodOverLoading {
	public static void add() {
		System.out.println(34);

	}

	public static void add(int a) {
		System.out.println(a);

	}

	public static void add(int a, int b) {
		System.out.println(a + b);

	}

	public static void add(double x, int y) {
		System.out.println(x + y);

	}

	public static void main(String args[]) {
		add();
		add(68);
		add(45, 5);
		add(56.5, 6);
	}

}
