package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
WebDriver driver;
	
	//login data
		String userName = "demo@techfios.com";
		String password = "abc123";
	
	@Test()
	public void validUserShouldBeAbleToLogIn() {
		
		driver= BrowserFactory.init();
		
		//creation of object with PageFactory() instead of new
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickSignin();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.verifyDashboardHeader("Dashboard");
		dashboardPage.clickOnCustomer();
		dashboardPage.clickOnAddCustomer();
		
		BrowserFactory.tearDown();
	}

}
