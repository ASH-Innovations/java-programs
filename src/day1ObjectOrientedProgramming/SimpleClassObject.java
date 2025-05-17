package day1ObjectOrientedProgramming;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SimpleClassObject {
	int a;
	int b;

	public void method1() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		SimpleClassObject ref = new SimpleClassObject();
		System.out.println(ref);
		ref.method1();
	}

}
