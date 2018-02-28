package Project.assign;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Project.assign.LoginPageObjects;
import Project.assign.ShiptPageObjects;
import utility.ConfigReader;

public class LoginTest extends invokeBrowser{

	ConfigReader read = new ConfigReader();
	

	@Test(priority=1)
	public void invalidPassword() throws Throwable {
		ShiptPageObjects.verifyMainLinks(driver);
		LoginPageObjects.verifyLoginAndSignUp(driver);
		LoginPageObjects.clickOnLogin(driver);
		LoginPageObjects.verifyLoginButtonDisplayed(driver);
		Thread.sleep(1000);
		LoginPageObjects.sendEmail(driver, read.getEmail());
		Thread.sleep(500);
		LoginPageObjects.sendPassword(driver, read.getPassword());
		Thread.sleep(1000);
		LoginPageObjects.clickOnLoginButton(driver);
		Thread.sleep(1000);
		LoginPageObjects.VerifyinvalidCredentials(driver);

	}
	@Test(priority=2)
	public void emptyEmailaddress()throws Throwable{
		ShiptPageObjects.verifyMainLinks(driver);
		LoginPageObjects.verifyLoginAndSignUp(driver);
		LoginPageObjects.clickOnLogin(driver);
		LoginPageObjects.verifyLoginButtonDisplayed(driver);
		Thread.sleep(1000);
		LoginPageObjects.sendEmail(driver, "");
		Thread.sleep(500);
		LoginPageObjects.sendPassword(driver, read.getPassword());
		Thread.sleep(1000);
		LoginPageObjects.clickOnLoginButton(driver);
		Thread.sleep(1000);
		LoginPageObjects.VerifyinvalidCredentials(driver);
		
	}
	@Test(priority=3)
	public void emptySpacePassword()throws Throwable{
		ShiptPageObjects.verifyMainLinks(driver);
		LoginPageObjects.verifyLoginAndSignUp(driver);
		LoginPageObjects.clickOnLogin(driver);
		LoginPageObjects.verifyLoginButtonDisplayed(driver);
		Thread.sleep(1000);
		LoginPageObjects.sendEmail(driver, read.getEmail());
		Thread.sleep(500);
		LoginPageObjects.sendPassword(driver, " ");
		Thread.sleep(1000);
		LoginPageObjects.clickOnLoginButton(driver);
		Thread.sleep(1000);
		LoginPageObjects.VerifyinvalidCredentials(driver);
		
	}

}
