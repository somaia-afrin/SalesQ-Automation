package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='txtEmail']")
	WebElement email;

	@FindBy(xpath = "//input[@id='txtUserPassword']")
	WebElement password;

	@FindBy(xpath = "//button[@id='btnLogin']")
	WebElement login;

	public void enterEmail(String em) {
		email.sendKeys(em);
	}

	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void submit() {
		login.click();
	}

}
