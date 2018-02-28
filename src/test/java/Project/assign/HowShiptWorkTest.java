package Project.assign;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Project.assign.ShiptPageObjects;
import utility.ConfigReader;

public class HowShiptWorkTest  extends invokeBrowser{
ConfigReader read=new ConfigReader();
	

	@Test
	public void verifyWhatIsShiptLinkAvailable() throws Throwable {
	
	
		ShiptPageObjects.verifyMainLinks(driver);
		ShiptPageObjects.clickHelp(driver);
		Thread.sleep(1000);
		ShiptPageObjects.VerifyHelpPageTitle(driver);
		ShiptPageObjects.clickonHowItWorks(driver);
		ShiptPageObjects.verifyTitleHowShiptiWorks(driver);
		ShiptPageObjects.verifyAndClickonWhatIsShipt(driver);
		Thread.sleep(1000);
		ShiptPageObjects.verifyText(driver);
		Thread.sleep(1000);
		ShiptPageObjects.verifyAndClickonWhatIsShipt(driver);
		Thread.sleep(1000);
		ShiptPageObjects.clickonShiptLogo(driver);
		Thread.sleep(1000);
		ShiptPageObjects.verifyMainLinks(driver);
		
		
		
		
		
		
		
		
		
	}

}
