package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import config.Hooks;
import utils.UIAutomationUtils;

public class GTPLBankHomepage extends UIAutomationUtils{
	
	WebDriver driver;
	
	public GTPLBankHomepage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	By userNameField = By.name("uid");
	By passwordField = By.name("password");
	By loginButton = By.name("btnLogin");
	
	public void login(String userId, String password) {
		super.navigateToUrl(Hooks.configObject.get("base_url"));
		super.type(userNameField, userId);
		super.type(passwordField, password);
		super.clickElement(loginButton);
	}
	
}
