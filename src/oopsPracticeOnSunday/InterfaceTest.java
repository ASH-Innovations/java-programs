package oopsPracticeOnSunday;

public interface InterfaceTest {
	void bankBalance();

	void moneyTransfer();

}

class ChildCLass implements InterfaceTest {

	@Override
	public void bankBalance() {
		System.out.println("Provided implementation logic for bank balance");
	}

	@Override
	public void moneyTransfer() {
		System.out.println("Provided implementation logic for moneyTransfer ");

	}

}

class Main {
	public static void main(String[] args) {
		/*
		 * ChildCLass ref = new ChildCLass(); ref.bankBalance();
		 */
		InterfaceTest ref1 = new ChildCLass();
		ref1.bankBalance();

	}
}
