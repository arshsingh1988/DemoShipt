package Project.assign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utility.ConfigReader;

public class invokeBrowser {
protected WebDriver driver;
	
	
	@BeforeMethod
	

	public void invokeChrome() throws InterruptedException {

ConfigReader Data=new ConfigReader();
		
		System.setProperty("webdriver.chrome.driver",Data.getBrowserPath() );
		
		driver=new ChromeDriver();
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get(Data.getbaseUrl());
		Thread.sleep(2000);
		
	}
	@AfterMethod
	public void closeChrome() {
		driver.quit();
	}
	

}
