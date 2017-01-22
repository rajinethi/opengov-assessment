package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Validation 
{
	public static boolean istext_visible(WebDriver driver, String ExpText)
	{
		//TODO: it's incomplete.. Please refer to Testable
		 //Capture Entire Text Visible At page
		 String OutterText=driver.findElement(By.tagName("body")).getText();
		 
		//Accept Condition When Expected Behaviour match
		 if(OutterText.contains(ExpText))
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	}

}
