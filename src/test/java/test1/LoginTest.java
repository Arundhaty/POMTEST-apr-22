package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util1.BrowserFactory21;

public class LoginTest {
	
	WebDriver driver;
	//logindata/testdata
	String userName = "demo@techfios.com";
	String password = "abc123";
	
	@Test
	public void validUserShouldBeAbleToLogin(){
		
	 driver = BrowserFactory21.init();
	
		 LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		 loginpage.insertUserName(userName);
		 loginpage.insertPassword(password);
		 loginpage.clickSigninButton();
		 
		 DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		 dashboardPage.validateDashboardPage();
		 
		 BrowserFactory21.tearDown();
	}	 
		
	}


