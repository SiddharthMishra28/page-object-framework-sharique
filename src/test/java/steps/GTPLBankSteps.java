package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class GTPLBankSteps {
	
	static WebDriver driver;
	
	@BeforeAll
	public static void beforeAll() {
		System.setProperty("webdriver.chromer.driver", "chrome");
		driver = new ChromeDriver();
	}
	
	@Given("I navigate to {string}")
	public void i_navigate_to(String url) {
	    driver.get(url);
	}
	@When("I Enter {string} and {string}")
	public void i_enter_and(String username, String password) {
	    driver.findElement(By.name("uid")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
	}
	@When("I click on {string} button")
	public void i_click_on_button(String buttonText) {
	    driver.findElement(By.xpath("//input[@value='"+buttonText+"']")).click();
	}
	
	@AfterAll
	public static void afterAll() {
		driver.quit();
	}
}
