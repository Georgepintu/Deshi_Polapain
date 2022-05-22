package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AddContactPage extends BasePage {
	WebDriver driver;

	public AddContactPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//h5[text()='Add Contact']")
	WebElement ADD_CONTACT_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement FULL_NAME;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']")
	WebElement COMPANY;
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement EMAIL;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']")
	WebElement PHONE;
	@FindBy(how = How.XPATH, using = "//input[@id='address']")
	WebElement ADDRESS;
	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	WebElement CITY;
	@FindBy(how = How.XPATH, using = "//input[@id='state']")
	WebElement STATE;
	@FindBy(how = How.XPATH, using = "//input[@id='zip']")
	WebElement ZIP;
	@FindBy(how = How.XPATH, using = "//select[@id = 'country']")
	WebElement COUNTRY;
	@FindBy(how = How.XPATH, using = "//button[@id='submit']")
	WebElement SAVE_BUTTON;

	public void validateAddContactPage(String addContact) {
		Assert.assertEquals(ADD_CONTACT_HEADER_ELEMENT.getText(), addContact, "Wrong Page");
	}

	public void insertFullName(String fullName) {
		FULL_NAME.sendKeys(fullName + generateRandomNo(999));
	}

	public void selectCompany(String company) {
		selectFromDropdown(COMPANY, company);
	}

	public void insertEmail(String email) {
		EMAIL.sendKeys(generateRandomNo(999) + email);
	}

	public void insertPhone(String phone) {
		PHONE.sendKeys(phone + generateRandomNo(99));
	}

	public void insertAddress(String address) {
		ADDRESS.sendKeys(address);
	}

	public void insertCity(String city) {
		CITY.sendKeys(city);
	}

	public void insertState(String state) {
		STATE.sendKeys(state);
	}

	public void insertZip(String zip) {
		ZIP.sendKeys(zip);
	}

	public void selectCountry(String country) {
		selectFromDropdown(COUNTRY, country);
	}

	public void clickSaveButton() {
		SAVE_BUTTON.click();
	}

}
