package package1AccesssModifiers;

/**
 * | Modifier | Accessible in `ClassB` (different package)? | Why? | |
 * ----------- | ------------------------------------------- |
 * ------------------------------------------ | | `public` | ✅ Yes | It's public
 * | | *default* | ❌ No | Default has package-level access only | | `protected`
 * | ❌ No | Only subclasses or same package can access | | `private` | ❌ No |
 * Only within the same class |
 * 
 * @author srihari
 *
 */
public class ClassA {
	public int publicVariable;
	int defaultVariable;
	protected int protectedVariable;
	private int privateVariable;

	public void privateVariable() {
		System.out.println(privateVariable);
	}
	public static void main(String[] args) {
		ClassA ref=new ClassA();
		ref.privateVariable();
		
	}

}
