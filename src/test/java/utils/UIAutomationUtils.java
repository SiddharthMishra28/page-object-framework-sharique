package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UIAutomationUtils {
	// IMPLEMENTATION FOR RE-USABLE METHODS
	
	public WebDriver driver;
	
	public UIAutomationUtils(WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * 
	 * @param url
	 */
	public void navigateToUrl(String url) {
		this.driver.get(url);
	}
	
	public void clickElement(WebElement element) {
		element.click();
	}
	
	public void type(WebElement element, String text) {
		element.sendKeys(text);
	}
}
