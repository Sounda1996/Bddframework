package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class regPage {
	
	By fs=By.name("firstname");
	By ls=By.name("lastname");
	By eml=By.name("email");
	By tel=By.name("telephone");
	By pd=By.name("password");
	By cpd=By.name("confirm");
	By clk=By.name("agree");
	By cnt=By.xpath("//input[@type=\"submit\"]");
	By title=By.xpath("//*[@id=\"content\"]/div/div/a");
	By lout=By.xpath("//*[@id=\"column-right\"]/div/a[13]");
	
	public WebDriver driver;
	public regPage(WebDriver driver)
	{
		this.driver=driver;
	}
   public WebElement firstname()
{
	return driver.findElement(fs);
	
}
   public WebElement lastname()
   {
   	return driver.findElement(ls);
   	
   }
   public WebElement email()
   {
   	return driver.findElement(eml);
   	
   }
   public WebElement telephone()
   {
   	return driver.findElement(tel);
   	
   }
   public WebElement password()
   {
   	return driver.findElement(pd);
   	
   }
   public WebElement confirmpwd()
   {
   	return driver.findElement(cpd);
   	
   }
   
   public WebElement clk()
   {
   	return driver.findElement(clk);
   	
   }
   public WebElement submit()
   {
   	return driver.findElement(cnt);
   	
   }
   public WebElement title()
   {
   	return driver.findElement(title);
   	
   }
   public WebElement logout ()
   {
   	return driver.findElement(lout);
   	
   }
}
