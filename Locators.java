package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators {
   
	
	   /*Login  */
	
	  public static By sigin_username_editbox = By.xpath("//input[@name='email']");
	  public static By sigin_password_editbox = By.name("password");
	  public static By sigin_button = By.xpath("//button[contains(.,'Login')]");
	 
	  
	  /*error message*/
	 // public static By sigin_error_msg = By.xpath(".//*[@id='usernameError']");
	 // public static By sigin_password_error_msg = By.xpath(".//*[@id='passwordError']");
	  
	  public static By act=(By.xpath("//a[contains(@href,'#ACCOUNTS')]"));
	  
	  public static By cus=By.xpath("//a[@href='http://phptravels.net/admin/accounts/customers/']");
	  
	  
	  //Add button
	  public static By Add_btn= By.xpath("//button[@type='submit']");
	  
	  //new customers entry details
	  public static By firstname= By.name("fname");
	  public static By lastname  = By.name("lname");
	  public static By email = By.name("email");
	  public static By password = By.name("password");
	  public static By mobile= By.name("mobile");
	  public static By country= By.xpath("//select[@class = 'chosen-select select2-offscreen']");
	  public static By Address1= By.name("address1");
	  public static By Address2= By.name("address2");
	  public static By status= By.name("status");
	  
	  //submit
	  public static By submit= By.xpath("//div[@id='content']/form/div/div[3]/button");
	  
	  
	  
	  //customer tours
	  public static By adm_tour= By.xpath("//a[@href='#Tours']");
	  
	  //Admin tours
	  public static By Admin_tr=By.xpath("//a[@href='http://phptravels.net/admin/tours/']");
	  
	  //add tour
	  public static By adm_addtour= By.xpath("//a[@href='http://phptravels.net/admin/tours/add/']");
	  
	  public static By adm_trstatus= By.xpath("//select[@name='tourstatus']");
	  public static By adm_trname= By.xpath("//input[@name='tourname']");
	  public static By adm_adults= By.xpath("//input[contains(@name,'maxadult')]");
	  public static By adm_price= By.xpath("//input[contains(@name,'adultprice')]");
	  public static By adm_edbutton= By.xpath("//span[contains(@id,'adultbtn')]");
	  public static By adm_days= By.xpath("//input[contains(@name,'tourdays')]");
	  public static By adm_nights=By.xpath("//input[contains(@name,'tournights')]");
	  public static By adm_type= By.name("tourtype");
	  public static By adm_loc= By.name("locations[]");
	  public static By adm_submit= By.xpath("//button[contains(.,' Submit ')]");
	  
	  //logout
	  public static By logout=By.xpath("//a[contains(@href,'#')]");
	  
	  
	  
	  
}
