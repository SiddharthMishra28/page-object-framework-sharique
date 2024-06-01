package utils;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class WaitExamples {
	
//	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://juliemr.github.io/protractor-demo/");
//		driver.findElement(By.xpath("//input[@ng-model='first']")).sendKeys("15");
//		driver.findElement(By.xpath("//input[@ng-model='second']")).sendKeys("5");
//		driver.findElement(By.cssSelector("#gobutton")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		String text = driver.findElement(By.xpath("//h2[@class='ng-binding']")).getText();
//		System.out.println(text);
//	}
	
//	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(9));
//		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
//		driver.findElement(By.cssSelector("#display-other-button")).click();
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("#hidden"))));
//		driver.findElement(By.cssSelector("#hidden")).click();
//		driver.quit();
//	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		Wait wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofMillis(100L))
				.ignoring(NoSuchElementException.class);
	}
}
