package test1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util1.BrowserFactory21;

public class AddCustomerTest {

	WebDriver driver;
	//logindata/testdata
	String userName = "demo@techfios.com";
	String password = "abc123";
	
	//Testdata
	String fullName = "Java Selenium";
	String company = "Amazon";
	String email = "abc@techfios.com";
	String phone = "98765432";
	
	@Test
	public void validUserShouldBeAbleToLogin() throws InterruptedException  {
		Thread.sleep(2000);
	     driver = BrowserFactory21.init();
	     Thread.sleep(2000);
	     
		 LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		 loginpage.insertUserName(userName);
		 loginpage.insertPassword(password);
		 loginpage.clickSigninButton();
		
		 DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		 dashboardPage.validateDashboardPage();
		 Thread.sleep(2000);
		 dashboardPage.clickCustomerMenuButton();
		 dashboardPage.clickAddCustomerMenuElement();
		 
		 AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		 addCustomerPage.insertFullName(fullName);
		 addCustomerPage.selectCompanyDropdown(company);
		 addCustomerPage.insertEmail(email);
		 addCustomerPage.insertPhone(phone);
		 
		 
		 BrowserFactory21.tearDown();
		 
	}	 
		
	}



