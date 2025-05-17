package day1ObjectOrientedProgramming;

public class ClassAndObject {
	int a;
	int b;
	int c;
	int x;
	int y;
	int z;

	public void display1() {
		System.out.println("x value is: " + x);
		System.out.println("y value is: " + y);
		System.out.println("z value is: " + z);

	}

	public void display2() {
		System.out.println("a value is: " + a);
		System.out.println("b value is: " + b);
		System.out.println("c value is: " + c);

	}

	public static void main(String[] args) {
		ClassAndObject ref = new ClassAndObject();
		ref.x = 78;
		ref.y = 90;
		ref.z = 80;
		ref.display1();
		System.out.println("**************************");
		ref.a = 78;
		ref.b = 100;
		ref.c = 56;
		ref.display2();

	}

}
