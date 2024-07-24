package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObjs {

	WebDriver driver;

	public LoginObjs(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email")
	WebElement uname;
	
	@FindBy(id="pass")
	WebElement upass;
	
	@FindBy(name="login")
	WebElement clickLoginButton;
	
	@FindBy(xpath = "//span[contains(text(),'Gnanesh Damodara')]")
	WebElement validateUname;
	
	public void enterUname(String username) {
		uname.sendKeys(username);
	}
	
	public void enterPassword(String Upassword) {
		upass.sendKeys(Upassword);
	}
	
	public void clickOnLoginButton() {
		clickLoginButton.click();
	}

	public boolean validateUserName() {
		 return validateUname.isDisplayed();
	}
}
