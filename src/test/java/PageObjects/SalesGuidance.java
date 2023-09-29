package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesGuidance {
	WebDriver driver;

	public SalesGuidance(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[normalize-space()='Sales Guidance']")
	WebElement sales;

	@FindBy(xpath = "//span[normalize-space()='Add']")
	WebElement addsales;

	@FindBy(xpath = "//input[@name='stringField1']")
	WebElement title;

	@FindBy(xpath = "//div[@class='dx-dropdowneditor-input-wrapper']//div[@aria-label='Select']")
	WebElement datepicker;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-chevronright']")
	WebElement nextpage;

	@FindBy(xpath = "//td[@aria-label='Tuesday, October 10, 2023']")
	WebElement pickdate;

	@FindBy(xpath = "//div[@role='textbox']")
	WebElement message;

	@FindBy(xpath = "//span[normalize-space()='Save']")
	WebElement savesales;

	public void salesGuidance() {
		sales.click();
	}

	public void addSales() {
		addsales.click();
	}

	public void enterTitle(String t) {
		title.sendKeys(t);
	}

	public void date() {
		datepicker.click();
	}

	public void next() {
		nextpage.click();
	}

	public void pickDate() {
		pickdate.click();
	}

	public void enterMessage(String m) {
		message.sendKeys(m);
	}

	public void saveSales() {
		savesales.click();
	}

}
