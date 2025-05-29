package package2AccesssModifiers.copy;

import package1AccesssModifiers.*;

public class ClassC extends ClassA {
	public static void main(String[] args) {
		ClassC ref = new ClassC();
		System.out.println(ref.publicVariable);
		System.out.println(ref.protectedVariable);
	}

}
