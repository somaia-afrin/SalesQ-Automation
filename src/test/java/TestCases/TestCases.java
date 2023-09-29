package TestCases;

//import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

//import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Login;
import PageObjects.Customer;
import PageObjects.Dashboard;
import PageObjects.SalesGuidance;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCases {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO to-generated method stub

		WebDriverManager.chromedriver().setup();
		// WebDriverManager.chromedriver().clearDriverCache().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://web.cloudapper.com/");
		driver.manage().window().maximize();

		Thread.sleep(4000);

		Login lg = new Login(driver);

		lg.enterEmail("m2sysqa.05+29@gmail.com");
		lg.enterPassword("M2qatest@17");
		lg.submit();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Thread.sleep(4000);

		Dashboard ds = new Dashboard(driver);
		
		ds.skipBtn();
		ds.yesBtn();

		Customer cs = new Customer(driver);

		cs.customerbtn();
		cs.add();
		cs.dropdown();
		cs.jeorge();
		cs.enterContactname("John");
		cs.enterPhone("01681347430");
		cs.enterEmail("john@gmail.com");
		cs.customerName("john");
		cs.clickSave();
		
		
		Thread.sleep(3000);
		
		SalesGuidance sd=new SalesGuidance(driver);
		sd.salesGuidance();
		sd.addSales();
		sd.enterTitle("10 Steps to keep customer Happy!!!");
		sd.date();
		sd.next();
		sd.pickDate();
		sd.enterMessage("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
		sd.saveSales();
		

	}

}
