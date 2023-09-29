package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customer {
	WebDriver driver;

	public Customer(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//span[@class='menu-title'][normalize-space()='Customers']")
	WebElement customer;

	@FindBy(xpath = "//span[normalize-space()='Add']")
	WebElement addbtn;

	@FindBy(xpath = "//div[@role='combobox']")
	WebElement combobox;

	@FindBy(xpath = "//div[contains(text(),'Jeorge Gilbert')]")
	WebElement select1;

	@FindBy(xpath = "//input[@name='stringField5']")
	WebElement contactname;

	@FindBy(xpath = "//input[@id='phone']")
	WebElement phone;

	@FindBy(xpath = "//input[@name='stringField6']")
	WebElement email;

	@FindBy(xpath = "//input[@name='stringField7']")
	WebElement customername;

	@FindBy(xpath = "//dx-button[@aria-label='Save']")
	WebElement savebtn;

	public void customerbtn() {
		customer.click();
	}

	public void add() {
		addbtn.click();
	}

	public void dropdown() {
		combobox.click();
	}

	public void jeorge() {
		select1.click();
	}

	public void enterContactname(String cn) {
		contactname.sendKeys(cn);
	}

	public void enterPhone(String ph) {
		phone.sendKeys(ph);
	}

	public void enterEmail(String em) {
		email.sendKeys(em);
	}

	public void customerName(String cus) {
		customername.sendKeys(cus);
	}

	public void clickSave() {
		savebtn.click();
	}

	
}
