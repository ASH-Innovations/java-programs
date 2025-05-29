package package2AccesssModifiers.copy;

import package1AccesssModifiers.ClassA;


public class ClassB {
	public static void main(String[] args) {
		ClassA ref = new ClassA();
		System.out.println(ref.publicVariable);
		System.out.println(ref.defaultVariable);
		System.out.println(ref.protectedVariable);
		System.out.println(ref.privateVariable);

	}

}
