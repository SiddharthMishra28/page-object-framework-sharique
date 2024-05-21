package tests;

import org.testng.annotations.Test;

import config.Hooks;
import pages.GTPLBankHomepage;

public class GTPLBankLoginTest extends Hooks{
	
	@Test
	public void loginTest() throws InterruptedException {
		GTPLBankHomepage homepage = new GTPLBankHomepage(driver);
		homepage.login("mngr571718", "patygYh");
		Thread.sleep(2000);
	}
}
