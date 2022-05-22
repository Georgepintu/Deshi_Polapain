package page;

import java.util.Random;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	WebDriver driver;

	// creating a dropdown method
	public void selectFromDropdown(WebElement element, String visibleText) {
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleText);
	}

	// creating a random integer and returning it
	public int generateRandomNo(int boundaryNo) {
		Random rand = new Random();
		int generatedNo = rand.nextInt(boundaryNo);
		return generatedNo;
	}

	// keyboard Enter button
	public void hitEnter() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
	}

}
