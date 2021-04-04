package step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class appLoginSteps {
	
//	WebDriver driver = null;
//	LoginPage login;
//	
//	@SuppressWarnings("deprecation")
//	@Given("user is on login page")
//	public void user_is_on_login_page() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.get("https://www.saucedemo.com/");
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username, String password) {
//		login = new LoginPage(driver);
//		
//		login.enterUserName(username);
//		login.enterPassword(password);
//		
//	}
//
//	@And("clicks on login button")
//	public void clicks_on_login_button() {
//		login.clickLoginButton();
//		
//	}
//
//	@Then("user is navigated to home page")
//	public void user_is_navigated_to_home_page() throws InterruptedException {
//		if (driver.findElement(By.xpath("//span[contains(text(),'Products')]")).isDisplayed()) {
//			System.out.println("Login is successful");
//		}else {
//			System.out.println("Login is NOT successful");
//		}
//		Thread.sleep(300);
//		driver.close();
//	}
	
}
