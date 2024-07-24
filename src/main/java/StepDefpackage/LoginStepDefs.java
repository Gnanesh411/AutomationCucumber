package StepDefpackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.LoginObjs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

	WebDriver driver;
	LoginObjs lg;

	@Given("Open the browser and enter URL")
	public void open_the_browser_and_enter_url() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@When("User enter username {string}")
	public void user_enter_username(String uname) {

		lg = new LoginObjs(driver);
		lg.enterUname(uname);

	}

	@When("User enter password {string}")
	public void user_enter_password(String pass) {

		lg = new LoginObjs(driver);
		lg.enterPassword(pass);
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {

		lg = new LoginObjs(driver);
		lg.clickOnLoginButton();
	}

	@Then("User should get successfully logged in")
	public void user_should_get_successfully_logged_in() {
		Assert.assertTrue(lg.validateUserName());
	}
}
