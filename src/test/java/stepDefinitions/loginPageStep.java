package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginPageStep {

	public static WebDriver driver;

	@Given("User is present on login page")
	public void user_is_present_on_login_page() throws Exception {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable notifications");
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-redirects");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("User enters username")
	public void user_enters_username() {
		driver.findElement(By.id("email")).sendKeys("pravin230194@gmail.com");
	}

	@When("User enters password")
	public void user_enters_password() {
		driver.findElement(By.id("pass")).sendKeys("winpravin");
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}

	@Then("User lands on homepage")
	public void user_lands_on_homepage() {
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		driver.quit();
	}

}
