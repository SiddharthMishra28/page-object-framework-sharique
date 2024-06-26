package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void clickElement(By element) {
		driver.findElement(element).click();
	}
	
	public void type(By element, String text) {
		driver.findElement(element).sendKeys(text);
	}
	
	public boolean elementExist(By element) {
		if(driver.findElements(element).size()>0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void waitForWebElement(By element) {
//		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(Hooks.configObject.get("wait_duration"))));
//		wait.until(el -> driver.findElement(element).isDisplayed());
	}
}
