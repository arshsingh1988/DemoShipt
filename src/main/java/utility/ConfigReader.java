package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ConfigReader {
public static WebDriver driver;
	
	Properties pro= new Properties();
	public String BrowserPath;
	public String baseUrl;
	public String Email;
	public String Password;
	
	
	
	
	public ConfigReader() {
		try {
			File src= new File("src/main/java/utility/Data.properties");
			FileInputStream fis;
			fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	public String getBrowserPath() {
		String BrowserPath=pro.getProperty("BrowserPath");
		return BrowserPath;
	}
	public String getbaseUrl() {
		String baseUrl=pro.getProperty("baseUrl");
		return baseUrl;
	}
	public String getEmail() {
		String Email=pro.getProperty("Email");
		return Email;
	}
	public String getPassword() {
		String Password=pro.getProperty("Password");
		return Password;
	}
	

}
