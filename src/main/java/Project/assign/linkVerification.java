package Project.assign;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ConfigReader;

public class linkVerification {
static WebDriver driver;
	
	public static void main() throws Throwable 
	{
		ConfigReader Data=new ConfigReader();
		
		System.setProperty("webdriver.chrome.driver",Data.getBrowserPath() );
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(Data.getbaseUrl());
		Thread.sleep(2000);
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("Total links are "+links.size());
		
		for(int i=0;i<links.size();i++)
		{
			
			WebElement ele= links.get(i);
			
			String url=ele.getAttribute("href");
			
			verifyLinkActive(url);
			
		}
		
		
		
	}
	
	public static void verifyLinkActive(String linkUrl)
	{
        try 
        {
           URL url = new URL(linkUrl);
           
           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
           
           httpURLConnect.setConnectTimeout(3000);
           
           httpURLConnect.connect();
           
           if(httpURLConnect.getResponseCode()==200)
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
             
            }
          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
            }
        } catch (Exception e) {
           
        }
    } 
	
	//public static void inkove(WebDriver Driver) 
	{
		ConfigReader Data=new ConfigReader();
		
		System.setProperty("webdriver.chrome.driver",Data.getBrowserPath() );
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(Data.getbaseUrl());
	}

}
