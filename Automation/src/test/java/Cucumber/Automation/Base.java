package Cucumber.Automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
    public static Properties prop;
    
    public static WebDriver getDriver() throws IOException
    {
    	prop=new Properties();
    	FileInputStream fs=new FileInputStream("C:\\Users\\User\\eclipse-workspace\\Automation\\src\\test\\java\\Cucumber\\Automation\\config.properties");
    	prop.load(fs);
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Automation\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get(prop.getProperty("url"));
		 driver.manage().window().maximize();
    	return driver;
    }
}
