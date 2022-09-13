package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage{

	public void selectFromDropdown(WebElement element,String visibletext) {
		Select sel = new Select(element);
		sel.selectByVisibleText(visibletext);
}

	public int generateRndNum(int boundaryNum) {
		Random rnd = new Random();
		int generatedNum = rnd.nextInt(boundaryNum);
		return generatedNum;
		
	}
}