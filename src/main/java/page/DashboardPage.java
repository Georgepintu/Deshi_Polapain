package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {

	WebDriver driver;
	
	//we created a constructor to hold our driver variable, because when we use the PageFactory() method we declared driver as one of the arguments
	public DashboardPage(WebDriver driver) {
		this.driver= driver ;
	}
	
	//element list
	@FindBy(how = How.XPATH, using = "//h2[text()=' Dashboard ']") WebElement DASHBOARD_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//span[text()='Customers']") WebElement CUSTOMER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[text()='Add Customer']") WebElement ADD_CUSTOMER_ELEMENT;
	
	public void verifyDashboardHeader(String dashboard) {
		Assert.assertEquals(DASHBOARD_HEADER_ELEMENT.getText(), dashboard, "Wrong Page");
	}
	
	public void clickOnCustomer() {
		CUSTOMER_ELEMENT.click();
	}
	
	public void clickOnAddCustomer() {
		ADD_CUSTOMER_ELEMENT.click();
	}
	
	

}
