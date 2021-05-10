package stepDefination;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Cucumber.Automation.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObject.regPage;

public class registerstepDefination  
{
	public WebDriver driver;
	regPage rp;
	
	@Given("^user is already in registration page$")
	public void user_is_already_in_registration_page() throws IOException 
	{
	
	driver=Base.getDriver();
	
	}
	
	@Then("^user enters \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enters_and(String fs, String ls,String email,String tel) 
	{
		rp=new regPage(driver);
		rp.firstname().sendKeys(fs);
		rp.lastname().sendKeys(ls);
        rp.email().sendKeys(email);
		rp.telephone().sendKeys(tel);
		
	}
	
	@Then("^enters \"(.*)\" and \"(.*)\"$")
	public void enters_and(String pwd, String cnfmpwd) 
	{
		rp=new regPage(driver);
		rp.password().sendKeys(pwd);
		rp.confirmpwd().sendKeys(cnfmpwd);
		
	}
	
	@Then("^accept policy and click on continue$")
	public void accept_policy_and_click_on_continue() 
	{
		rp=new regPage(driver);
		rp.clk().click();
		rp.submit().click();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	}
	@Then("^verify the title and hit on continue button$")
	public void verify_the_title_and_hit_on_continue_button()
	{
		rp=new regPage(driver);
		String title = driver.getTitle();
		 System.out.println(" Page title ::"+ title);
		Assert.assertEquals("Your Account Has Been Created!", title);
		rp.title().click();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}
	
	@Then("^Logout$")
	public void Logout()
	{
		
		rp.logout().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.close();
		
	}
	
	
	
	
	
}
