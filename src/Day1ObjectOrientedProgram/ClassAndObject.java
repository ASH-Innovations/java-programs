package Day1ObjectOrientedProgram;

public class ClassAndObject {
	int a = 10;
	int b = 20;

	public void test() {
		System.out.println("Test method");
	}

	public static void main(String[] args) {
		ClassAndObject ref = new ClassAndObject();
		System.out.println(ref.a);
		System.out.println(ref.b);
	}

}
