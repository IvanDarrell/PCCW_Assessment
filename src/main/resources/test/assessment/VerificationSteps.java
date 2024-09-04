package assessment;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;
import elements.PortalPage;
import org.testng.annotations.Test;
import java.util.List;

public class VerificationSteps  extends BrowserHelper{
	WebElement element = null;
	
	
	public void click (String elementPath) { 
		
		
		WebElement element = driver.findElement(By.xpath(elementPath));
		
		
			
		
	
		System.out.print(element);
		
		}  
    
		
	
	
	
	public void waittime (WebDriver driver, Integer i) { 
			
		try {
			driver.wait(i);
			
		}  catch(Exception e) {
            // code to handle the exception
        }
		
	}

}
