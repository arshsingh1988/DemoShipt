package Project.assign;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShiptPageObjects {
	static WebDriver driver;

	static WebElement element;

	public static void verifyMainLinks(WebDriver driver) throws Throwable {

		String getPaidtoShopLink = "//a[contains(text(),'Get Paid to Shop')]";
		boolean getpaidLink = driver.findElement(By.xpath(getPaidtoShopLink)).isDisplayed();
		Assert.assertTrue(getpaidLink);

		String giftLink = "//a[contains(text(),'Gift')]";
		boolean helpLink = driver.findElement(By.xpath(giftLink)).isDisplayed();
		Assert.assertTrue(helpLink);

		String helpLinkText = "//a[contains(text(),'Help')]";
		boolean giftLinkText = driver.findElement(By.xpath(helpLinkText)).isDisplayed();
		Assert.assertTrue(giftLinkText);

	}

	public static void clickHelp(WebDriver driver) {

		String helpLinkText = "//a[contains(text(),'Help')]";
		element = driver.findElement(By.xpath(helpLinkText));
		element.click();

	}
	
	public static void VerifyHelpPageTitle(WebDriver driver) {
		System.out.println(driver.getTitle());
	
		
		if(driver.getTitle()=="Shipt Support") {
			
			Assert.assertTrue(true);
			
			}
		else {
			Assert.assertFalse(false);
		}
		
		
	}
	
	public static void clickonHowItWorks(WebDriver driver) {
		String howItWorks="//i[@class='ss-cart']/parent::a";
		
		element=driver.findElement(By.xpath(howItWorks));
		element.click();
		
	}
	public static void verifyTitleHowShiptiWorks(WebDriver driver) {
    
		System.out.println(driver.getTitle());
	
		
		if(driver.getTitle()=="Shipt Support") {
			
			Assert.assertTrue(true);
			
			}
		else {
			Assert.assertFalse(false);
		}
		
	}
	
	public static void verifyAndClickonWhatIsShipt(WebDriver driver) {
		String xpath="//a[contains(text(),'What is Shipt')]";
		boolean shipt=driver.findElement(By.xpath(xpath)).isDisplayed();
		Assert.assertTrue(shipt);
		
		element=driver.findElement(By.xpath(xpath));
		element.click();
	}
	
	
	public static void verifyText(WebDriver driver) {
		String xpath="//p[contains(text(),'Hello! Shipt')]";
		boolean shipt=driver.findElement(By.xpath(xpath)).isDisplayed();
		Assert.assertTrue(shipt);
	}
	
	public static void clickonShiptLogo(WebDriver driver) {
		String logo="//a[@class='header_nav_logo']";
		element=driver.findElement(By.xpath(logo));
		element.click();
	
	}
	
	


}
