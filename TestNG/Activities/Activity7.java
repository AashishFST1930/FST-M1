package Activities;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.SubmissionPublisher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity7 {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void setup() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/login-form");
	}

	@Test(priority = 1)
	public void homePageTest() {
		Assert.assertEquals(driver.getTitle(), "Selenium: Login Form");
	}

	@DataProvider(name = "invalidCredential")
	public Object[][] creds() {
		return new Object[][] { { "admin", "incorectPassword" }, { "incorectAdmin", "Password" },
				{ "admin", "@#$^^Y&" }, { "DELETE TABLE users;", "Password" } };
	}

	@Test(priority = 2, dataProvider = "invalidCredential")
	public void invalidLoginTest(String usernmae, String password) throws InterruptedException {

		WebElement usernamefield = driver.findElement(By.id("username"));
		WebElement passwordfield = driver.findElement(By.id("password"));
		WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));

		usernamefield.clear();
		passwordfield.clear();

		usernamefield.sendKeys(usernmae);
		passwordfield.sendKeys(password);
		submitButton.click();

		Thread.sleep(5000);
		String message = driver.findElement(By.id("subheading")).getText();
		assertEquals(message, "Invalid credentials");

	}

	@Test(priority = 3)
	public void validLoginTest() throws InterruptedException {
		WebElement usernamefield = driver.findElement(By.id("username"));
		WebElement passwordfield = driver.findElement(By.id("password"));
		WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));

		usernamefield.clear();
		passwordfield.clear();

		usernamefield.sendKeys("admin");
		passwordfield.sendKeys("password");
		submitButton.click();

		
		Thread.sleep(5000);
		
		String message = driver.findElement(By.xpath("//h2[text()='Welcome Back, Admin!']")).getText();
		assertEquals(message, "Welcome Back, Admin!");

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
