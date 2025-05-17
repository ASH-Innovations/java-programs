package day3OOPS;

public interface Browser {
	void openBrowser();

	void enterURL(String URL);

	void closeBrowser();

}

class ChromeBrowser implements Browser {

	@Override
	public void openBrowser() {
		System.out.println("Open Browser implementaiton for Chrome");

	}

	@Override
	public void enterURL(String URL) {
		System.out.println("URL Implementation for chrome");

	}

	@Override
	public void closeBrowser() {
		System.out.println("Close browser implementtion for chrome");

	}

}

class FireFoxBrowser implements Browser {

	@Override
	public void openBrowser() {
		System.out.println("Open Browser implementaiton for firefox");

	}

	@Override
	public void enterURL(String URL) {
		System.out.println("URL Implementation for firefox");

	}

	@Override
	public void closeBrowser() {
		System.out.println("Close browser implementtion for firefox");

	}

}

class BrowserTest {
	public static void main(String[] args) {
		Browser browserProperties = new ChromeBrowser();
		browserProperties.openBrowser();
		browserProperties.enterURL("Chrome");
		browserProperties.closeBrowser();
	}

}
