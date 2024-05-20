package tests;

import org.testng.annotations.Test;
import config.Hooks;
import utils.UIAutomationUtils;

public class NavigationTest extends Hooks{

	
	@Test
	public void navigateToAppTest() {
		UIAutomationUtils utils = new UIAutomationUtils(this.driver);
		utils.navigateToUrl("https://demo.guru99.com/V1/");
	}
	
//	@Test
//	public void loginWithCreds() {
//		utils.type(this.driver.findElement(By.name("uid")), "mngr571718");
//		utils.type(this.driver.findElement(By.name("password")), "patygYh");
//		utils.clickElement(this.driver.findElement(By.name("btnLogin")));
//	}
	
	
}
