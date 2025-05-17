package day1ObjectOrientedProgramming;

public class ClassAndObject2 {
	int a;
	int b;
	int c;
	static int d;

	public void method1() {
		System.out.println(a);
		System.out.println(b);

	}

	public void method2() {
		System.out.println(c);

	}

	public void method3() {
		method1();

	}

	public static void method4() {
		System.out.println(d);

	}

	public static void main(String args[]) {
		method4();
		method4();

	}

}
