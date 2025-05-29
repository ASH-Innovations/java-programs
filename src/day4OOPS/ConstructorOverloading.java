package day4OOPS;

public class ConstructorOverloading {
	public ConstructorOverloading() {
		System.out.println(67);

	}

	public ConstructorOverloading(int a) {
		System.out.println(a);

	}

	public ConstructorOverloading(int a, int b) {

	}

	public static int add() {

		return 45;
	}

	public static int add(int a) {

		return a;
	}

	public static void main(String[] args) {
		ConstructorOverloading ref = new ConstructorOverloading(89);
		System.out.println(ref);
		add();
		int result1 = add(68);
		System.out.println(result1);

	}

}
