package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageElement {
	
	
	public static WebElement signin_username_editbox(WebDriver driver)
	{
		
		return driver.findElement(Locators.sigin_username_editbox);
	}
	
	public static WebElement signin_pwd_editbox(WebDriver driver)
	{
		return driver.findElement(Locators.sigin_password_editbox);
	}
	
	public static WebElement sigin_button(WebDriver driver)
	{
		return driver.findElement(Locators.sigin_button);
	}
	
	/*public static WebElement sigin_button(WebDriver driver) throws InterruptedException 
	{
		Thread.sleep(8000);
		return driver.findElement(Locators.sigin_button);
			
	}*/
	
	public static WebElement acc(WebDriver driver)
	{
	return driver.findElement(Locators.act);
		}
	
	public static WebElement cust(WebDriver driver)
	{
		return driver.findElement(Locators.cus);
			}
	public static WebElement addbutton(WebDriver driver)
	{
		return driver.findElement(Locators.Add_btn);
	}
	
	public static WebElement cust_fname(WebDriver driver)
	{
		return driver.findElement(Locators.firstname);
	}
	
	public static WebElement cust_lname(WebDriver driver)
	{
		return driver.findElement(Locators.lastname);
	}
	public static WebElement cust_email(WebDriver driver)
	{
		return driver.findElement(Locators.email);
	}
	public static WebElement cust_password(WebDriver driver)
	{
		return driver.findElement(Locators.password);
	}
	
	public static WebElement cust_mobile(WebDriver driver)
	{
		return driver.findElement(Locators.mobile);
	}
	public static Select cust_country(WebDriver driver)
	{
		return new Select(driver.findElement(Locators.country));
	}
	public static WebElement cust_adr1(WebDriver driver)
	{
		return driver.findElement(Locators.Address1);
	}
	public static WebElement cust_adr2(WebDriver driver)
	{
		return driver.findElement(Locators.Address2);
	}
	public static Select cust_status(WebDriver driver)
	{
		return new Select(driver.findElement(Locators.status));
	}
	
	public static WebElement cust_subbutton(WebDriver driver)
	{
		return driver.findElement(Locators.submit);
	}
	
	public static WebElement ad_tour(WebDriver driver)
	{
		return driver.findElement(Locators.adm_tour);
	}
	public static WebElement ad_newtour(WebDriver driver)
	{
		return driver.findElement(Locators.adm_addtour);
	}
	
	public static Select ad_status(WebDriver driver)
	{
		return new Select(driver.findElement(Locators.adm_trstatus));
	}
	
	public static WebElement ad_tname(WebDriver driver)
	{
		return driver.findElement(Locators.adm_trname);
	}
	
	public static WebElement ad_adu(WebDriver driver)
	{
		return driver.findElement(Locators.adm_adults);
	}

	public static WebElement ad_price(WebDriver driver)
	{
		return driver.findElement(Locators.adm_price);
	}
	public static WebElement ad_button(WebDriver driver)
	{
		return driver.findElement(Locators.adm_edbutton);
	}
	public static WebElement ad_days(WebDriver driver)
	{
		return driver.findElement(Locators.adm_days);
	}
	public static WebElement ad_nights(WebDriver driver)
	{
		return driver.findElement(Locators.adm_nights);
	}
	public static Select ad_typr(WebDriver driver)
	{
		return new Select (driver.findElement(Locators.adm_type));
	}
	public static Select ad_location(WebDriver driver)
	{
		return new Select (driver.findElement(Locators.adm_loc));
	}
	public static WebElement ad_submit(WebDriver driver)
	{
		return driver.findElement(Locators.adm_submit);
	}
	public static WebElement admin_tour(WebDriver driver)
	{
		return driver.findElement(Locators.Admin_tr);
	}
	
	public static Select logout(WebDriver driver)
	{
		return new Select (driver.findElement(Locators.logout));
	}
	
}
