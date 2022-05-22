package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
WebDriver driver;
	
	//we created a constructor to hold our driver variable, because when we use the PageFactory() method we declared driver as one of the arguments
	public LoginPage(WebDriver driver) {
		this.driver= driver ;
		
	}
	
	//traditional way of locating a web element
	//WebElement USER_NAME_ELEMENT = driver.findElement(By.xpath("//input[@id='username']"));
	@FindBy(how = How.XPATH, using = "//input[@id='username']") WebElement USER_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='password']") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@name='login']") WebElement LOGIN_ELEMENT;
	
	//individual technique- declaring individual method for individual operation
	public void insertUserName(String userName) {
		USER_NAME_ELEMENT.sendKeys(userName);
	}
	
	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}
	
	public void clickSignin() {
		LOGIN_ELEMENT.click();
	}
}