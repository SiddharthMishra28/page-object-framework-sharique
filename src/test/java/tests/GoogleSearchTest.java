package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import config.Hooks;

public class GoogleSearchTest extends Hooks{
	
	@Test(dataProvider = "loginProvider")
	public void googleSearchTestPositve(
			String url,
			String userIdLocator,
			String userId,
			String passwordLocator,
			String password) throws InterruptedException {
		System.setProperty("webdriver.chromer.driver", configObject.get("browser_driver_path"));
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.name(userIdLocator)).sendKeys(userId);
		driver.findElement(By.name(passwordLocator)).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(2000);
		driver.quit();
	}
	
	@DataProvider(name = "loginProvider")
	public Object[][] loginDataProvider() {
		Object[][] loginCreds = new Object[][] {
			{"https://demo.guru99.com/V1/index.php","uid", "mngr571718", "password", "hdsajda"},
			{"https://demo.guru99.com/V1/index.php","uid", "mngr5717", "password", "patygYh"},
			{"https://demo.guru99.com/V1/index.php","uid", "sahdsd", "password", "hdkhsadskd"},
			{"https://demo.guru99.com/V1/index.php","uid", "mngr571718", "password", "patygYh"}
		};
		return loginCreds;
	}
	
}
