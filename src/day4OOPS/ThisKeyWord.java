package day4OOPS;

public class ThisKeyWord {
	int a;
	int b;
	int c;

	public ThisKeyWord(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		ThisKeyWord ref = new ThisKeyWord(45, 34, 1);
	}

}
