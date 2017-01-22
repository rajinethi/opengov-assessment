package page_objects;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import page_objects.PageElement;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

import com.thoughtworks.selenium.webdriven.commands.IsTextPresent;
import com.thoughtworks.selenium.webdriven.commands.IsVisible;

public class Testable {
	
	public static WebDriver driver;
	@BeforeTest
	public void Application1()	
	
	{
		driver= new FirefoxDriver();
		driver.get(InputData.App_url);
		driver.manage().window().maximize();
	}
	
	
	@org.testng.annotations.Test(priority=1)
	public void Admin_entry() throws InterruptedException
	{
		//WebElement webElement = PageElement.signin_username_editbox(driver);
		//System.out.println("Entire webElement "+webElement);
		//System.out.println("Sign in user "+webElement.findElement(Locators.sigin_username_editbox));
		
		//PageElement.signin_pwd_editbox(driver).sendKeys(InputData.Admin_password_editbox);
		
		PageElement.signin_username_editbox(driver).sendKeys(InputData.Admin_username_editbox);
		//Assert.assertEquals(PageElement.signin_username_editbox(driver), true);
		PageElement.signin_pwd_editbox(driver).sendKeys(InputData.Admin_password_editbox);
		
		PageElement.sigin_button(driver).click();
		Thread.sleep(8000);
	}	
	
	@org.testng.annotations.Test(priority=2)
	
	public void Accounts() throws InterruptedException
	{
		PageElement.acc(driver).click();
		Thread.sleep(5000);
	}
	
	@org.testng.annotations.Test(priority=3)
	public void Customers()
	{
		PageElement.cust(driver).click();
		
	}
	@org.testng.annotations.Test(priority=4)
	public void Add_button() throws InterruptedException
	{
		Thread.sleep(2000);
		PageElement.addbutton(driver).click();
			}
	
	@org.testng.annotations.Test(priority =5)
	public void Customer_Entry() throws InterruptedException
	{
	    PageElement.cust_fname(driver).sendKeys(InputData.cus_fname);
	    Assert.assertNotNull(PageElement.cust_fname(driver));
	    
		PageElement.cust_lname(driver).sendKeys(InputData.cus_lname);
		Assert.assertNotNull(PageElement.cust_lname(driver));
		
		PageElement.cust_email(driver).sendKeys(InputData.cus_email);
		Assert.assertNotNull(PageElement.cust_email(driver));
		
		PageElement.cust_password(driver).sendKeys(InputData.cus_pwd);
		Assert.assertNotNull(PageElement.cust_password(driver));
		
		PageElement.cust_country(driver).selectByVisibleText("United States");
		Assert.assertNotNull(PageElement.cust_country(driver));
		
		PageElement.cust_status(driver).selectByVisibleText("Enabled");
		Assert.assertNotNull(PageElement.cust_status(driver));
		
		PageElement.cust_subbutton(driver).click();
		
             Thread.sleep(8000);
	}
	
	
	@org.testng.annotations.Test(priority=6)
	public void customer_tour() throws InterruptedException
	{
		
		PageElement.ad_tour(driver).click();
		PageElement.ad_newtour(driver).click();
		
		PageElement.ad_status(driver).selectByVisibleText("Enabled");
		Assert.assertNotNull(PageElement.ad_status(driver));
		
		PageElement.ad_tname(driver).sendKeys(InputData.adtour_name);
		
		PageElement.ad_button(driver).isEnabled();
		
		
		PageElement.ad_adu(driver).sendKeys(InputData.adtour_Adquantitiy);
		Assert.assertNotNull(PageElement.ad_adu(driver));
		
		PageElement.ad_price(driver).sendKeys(InputData.adtour_price);
		Assert.assertNotNull(PageElement.ad_price(driver));
		
		PageElement.ad_days(driver).sendKeys(InputData.adtour_days);
		Assert.assertNotNull(PageElement.ad_days(driver));
		
		PageElement.ad_nights(driver).sendKeys(InputData.adtour_nights);
		Assert.assertNotNull(PageElement.ad_tour(driver));
		
		PageElement.ad_typr(driver).selectByVisibleText("Private");
		Assert.assertNotNull(PageElement.ad_typr(driver));
		
		PageElement.ad_location(driver).selectByVisibleText("Sharjah");
		Assert.assertNotNull(PageElement.ad_location(driver));
		
		PageElement.ad_submit(driver).click();
		Assert.assertNotNull(PageElement.ad_submit(driver));
		
		 
		
		
	}
	
	@org.testng.annotations.Test(priority=7)
	public void admin_tr()
	{
		PageElement.ad_tour(driver).click();
		PageElement.admin_tour(driver).click();
		Assert.assertNotNull(PageElement.admin_tour(driver));
		
		PageElement.addbutton(driver).click();
		
		PageElement.ad_status(driver).selectByVisibleText("Enabled");
		Assert.assertNotNull(PageElement.ad_status(driver));
		
		PageElement.ad_tname(driver).sendKeys(InputData.adtour_name);
		
		PageElement.ad_button(driver).isEnabled();
		
		
		PageElement.ad_adu(driver).sendKeys(InputData.adtour_Adquantitiy);
		Assert.assertNotNull(PageElement.ad_adu(driver));
		
		PageElement.ad_price(driver).sendKeys(InputData.adtour_price);
		Assert.assertNotNull(PageElement.ad_price(driver));
		
		PageElement.ad_days(driver).sendKeys(InputData.adtour_days);
		Assert.assertNotNull(PageElement.ad_days(driver));
		
		PageElement.ad_nights(driver).sendKeys(InputData.adtour_nights);
		Assert.assertNotNull(PageElement.ad_tour(driver));
		
		PageElement.ad_typr(driver).selectByVisibleText("Private");
		Assert.assertNotNull(PageElement.ad_typr(driver));
		
		PageElement.ad_location(driver).selectByVisibleText("Sharjah");
		Assert.assertNotNull(PageElement.ad_location(driver));
		
		PageElement.ad_submit(driver).click();
		Assert.assertNotNull(PageElement.ad_submit(driver));
	}  
	
	
	//@AfterTest
	/*@org.testng.annotations.Test
	public void PageLogout()
	{
		PageElement.logout(driver).selectByVisibleText("Log Out");;
	}*/
	
	
	
	
		
		
}
