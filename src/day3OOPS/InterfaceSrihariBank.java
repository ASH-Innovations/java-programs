package day3OOPS;

public interface InterfaceSrihariBank {

	int number = 9867;

	public void bankBalance();

	void deposite();

	public void message();

	default void test() {
		System.out.println("test method implementation");
	}

	default void test1() {
		System.out.println("test1 method implementation");
	}

	public static void main(String[] args) {

		System.out.println("Execution starts from main method");

	}

}

interface InterfaceYesBank extends InterfaceSrihariBank {
	static final int number = 6789;

	public void bankBalance();

	void deposite();

}

class MainReserveBank implements InterfaceSrihariBank, InterfaceYesBank {

	@Override
	public void bankBalance() {
		System.out.println("I have provided implementation for bank balance here in reserve bank ");

	}

	@Override
	public void deposite() {
		System.out.println("I have provided implementation for depostite here in reserve bank ");

	}

	public static void main(String[] args) {

		InterfaceYesBank ref = new MainReserveBank();
		System.out.println(ref);
		ref.bankBalance();
		ref.deposite();

		InterfaceSrihariBank ref1 = new MainReserveBank();
		ref1.message();

	}

	@Override
	public void message() {
		System.out.println("I have provided implementation for message service here in reserve bank ");

	}
}
