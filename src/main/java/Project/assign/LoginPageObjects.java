package Project.assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPageObjects {
	
	WebDriver driver;
	static WebElement element;
	static String login = "//a[contains(text(),'Log In')]";
	static String signUp = "//a[contains(text(),'Sign up')]";
	static String loginButton="//button[@id='start_shopping_login_button']";

	public static void verifyLoginAndSignUp(WebDriver driver) {

		boolean logintext = driver.findElement(By.xpath(login)).isDisplayed();
		Assert.assertTrue(logintext);

		boolean signUpText = driver.findElement(By.xpath(signUp)).isDisplayed();
		Assert.assertTrue(signUpText);

	}

	public static void clickOnLogin(WebDriver driver) {
		element = driver.findElement(By.xpath(login));
		element.click();

	}
	
	public static void sendEmail(WebDriver driver, String email) {
		String xpath="//input[@type='email']";
		element=driver.findElement(By.xpath(xpath));
		element.sendKeys(email);
	}
	public static void sendPassword(WebDriver driver, String password) {
		String xpath="//input[@type='password']";
		element=driver.findElement(By.xpath(xpath));
		element.sendKeys(password);
	}
	public static void VerifyinvalidCredentials(WebDriver driver) {
		String xpath="//div[@ng-show='invalidLogin']";
		boolean invalid=driver.findElement(By.xpath(xpath)).isDisplayed();
		Assert.assertTrue(invalid);
	}
	public static void verifyLoginButtonDisplayed(WebDriver driver) {
		
		boolean verifyLogin=driver.findElement(By.xpath(loginButton)).isDisplayed();
		Assert.assertTrue(verifyLogin);
	}
	public static void clickOnLoginButton(WebDriver driver) {
		element=driver.findElement(By.xpath(loginButton));
		element.click();
		
	}
	


}
