package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import utils.UIAutomationUtils;

public class LoginFunctionalityClass extends UIAutomationUtils{
	
	WebDriver driver;

	public LoginFunctionalityClass(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	public void login(String userName, String password) throws IOException {
		this.navigateToUrl("https://demo.guru99.com/V1/index.php");
		this.type(this.getLocatorFromDataSource("loginPage", "userIdField"), userName);
		this.type(this.getLocatorFromDataSource("loginPage", "passwordField"), password);
		this.clickElement(this.getLocatorFromDataSource("loginPage", "loginButton"));
		String compiledPath = String.format("//%s[contains(text(),%s)]", "a", "Men");
		// matchBytext=Men
		// "MatchByText=men" - from Excel
//		String functionName = "MatchByText=men".split("=")[0];
//		String text = "MatchByText=men".split("=")[1];
//		switch(functionName) {
//		case "MatchByText":
//			return String.format("//%s[contains(text(),%s)]", "a", text);
//			break;
//			
//		case "ContainsText":
//			
//		}
	}
}
