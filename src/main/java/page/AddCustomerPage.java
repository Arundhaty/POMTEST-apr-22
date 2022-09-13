package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddCustomerPage extends BasePage{
 
	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//Select[@id=\"cid\"]")
	WebElement COMPANY_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
	WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")
	WebElement PHONE_NUM__ELEMENT;

	public void insertFullName(String fullName) {
		String insertedName = fullName + generateRndNum(999);
		FULL_NAME_ELEMENT.sendKeys(insertedName);

	}

	public void selectCompanyDropdown(String company) {
		selectFromDropdown(COMPANY_DROPDOWN_ELEMENT,company);
	}
	
	public void insertEmail(String email) {
		String insertedEmail = generateRndNum(99)+ email;
		EMAIL_ELEMENT.sendKeys(insertedEmail);
	}

	public void insertPhone(String phone) {
		String insertedPhone = phone + generateRndNum(999);
		PHONE_NUM__ELEMENT.sendKeys(insertedPhone);
	}
		
	}
		
	
	

		
	
