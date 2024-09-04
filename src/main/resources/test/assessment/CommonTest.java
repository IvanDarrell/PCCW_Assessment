package assessment;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import elements.PortalPage;
import assessment.VerificationSteps;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;



public class CommonTest extends BrowserHelper{
	
	PortalPage portal = new PortalPage();   
    VerificationSteps verif = new VerificationSteps();
    
	
	 @Test
		public void executebrowser () {
			
			try {
				
			
			
			
			startbrowser("https://practicetestautomation.com/practice-test-login");
		
			} catch(Exception e) {
	            // code to handle the exception
	        }
				
		}
	
	 public void waituntilelement(WebDriver driver, WebElement webElement, long timeOutInSeconds) {
			WebDriverWait wait = new WebDriverWait((WebDriver) driver, Duration.ofSeconds(30));
		  }
	
	
	@SuppressWarnings("deprecation")
	@Test
	 public void contactpage () {
			
				
				
			
				
				
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				WebElement contact = driver.findElement(By.xpath("//li[@id=\"nav-contact\"]"));
				contact.click();
				
				
				 
				
				
				
				
				/*
				//String test = driver.findElement(By.xpath("")).getText();
				System.out.print(test);
				
				if (test == "We welcome your feedback - tell it how it is.") {
					
					System.out.print("WOW");
					
				} else {
					
					System.out.print("BOBO");
					
				}
				*/
				
				
			} 
				
	@Test
	 public void submitcontactpage () { 
		
		WebElement submit = driver.findElement(By.xpath("//a[@class=\"btn-contact btn btn-primary\"]"));
		submit.click();
		
		
		//Verify message
		String forenameerror = driver.findElement(By.id("forename-err")).getText();
		String emailerror = driver.findElement(By.id("email-err")).getText();
		String messageerror = driver.findElement(By.id("message-err")).getText();
		
		
		System.out.println(forenameerror);
		System.out.println(emailerror);
		System.out.println(messageerror);
		
		if (forenameerror.equals("Forename is required")) {
			
			System.out.println("Error message is correct");
			
		} else {
			
			System.out.println("Error message is incorrect");
		}
		
		
		if (emailerror.equals("Email is required")) {
			
			System.out.println("Email error is correct");
			
		} else {
			
			System.out.println("Email error is incorrect");
		}
		
		
		
		if (messageerror.equals("Message is required")) {
			
			System.out.println("Message error is correct");
			
		} else {
			
			System.out.println("Message error is incorrect");
		}
		
		
		
		
		
		WebElement forename = driver.findElement(By.xpath("//label[@for=\"forename\"]/following-sibling::div/input"));
		
		String attribute = forename.getAttribute("required");
	
		if (attribute.equals("true")) {
			
			System.out.println("Forename is  Required");
			
		} else {
			
			System.out.println("Email is not required");
		}
		
		
		WebElement email = driver.findElement(By.xpath("//label[@for=\"email\"]/following-sibling::div/input"));
		String emailattribute= email.getAttribute("required");
		
		
		if (emailattribute.equals("true")) {
			
			System.out.println("Email is  Required");
			
		} else {
			
			System.out.println("Email is not required");
		}
		
		
		
		WebElement message = driver.findElement(By.xpath("//label[@for=\"message\"]/following-sibling::div/textarea"));
		String messagelattribute= message.getAttribute("required");
		
		
		if (messagelattribute.equals("true")) {
			
			System.out.println("Email is  Required");
			
		} else {
			
			System.out.println("Email is not required");
		}
		
		
		
		//Input data in fields
		String name = "Johnny Boy";
		// Non mandatory fields
		WebElement surname = driver.findElement(By.xpath("//input[@id=\"surname\"]"));
		WebElement telephone = driver.findElement(By.xpath("//input[@id=\"telephone\"]"));
		//Forename
		forename.clear();
		forename.sendKeys(name);
		
		//Email
		email.clear();
		email.sendKeys("john.popolito@google.com");
		
		
		//Messageurname
		message.clear();
		message.sendKeys("THIS IS ONLY A TEST");
		
		//Surname
		surname.clear();
		surname.sendKeys("Bengbeng");
		
		//Surname
		telephone.clear();
		telephone.sendKeys("091341");
		
		
		//Verify if error are gone
		
		submit.click();
		
		
		WebElement success = driver.findElement(By.xpath("//div[@class=\"alert alert-success\"]"));
		
		waituntilelement(driver, success , 10);
		
		
		//Verify success message
		String successmessage = driver.findElement(By.xpath("//div[@class=\"alert alert-success\"]")).getText();
		
		System.out.println(successmessage);
		
		
		if (successmessage.equals("Thanks "+name+", we appreciate your feedback.")) {
			
			System.out.println("Success Message is correct");
		} else {
			System.out.println("Success Message is incorrect");
		}
	}
	 
	 
	 

	
	
	
	
	
	
	
	@Test
	 public void NegativeUsernameTest (String username, String password ) throws InterruptedException { 
		
		
		WebElement username1 = driver.findElement(By.xpath("//input[@id=\"username\"]"));
		WebElement password1 = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		WebElement submit = driver.findElement(By.xpath("//button[@id=\"submit\"]"));
		
		//Verify if the Elements are visible
		username1.isDisplayed();
		TimeUnit.SECONDS.sleep(4);
		password1.isDisplayed();
		TimeUnit.SECONDS.sleep(4);
		submit.isDisplayed();
		TimeUnit.SECONDS.sleep(4);
		
		//Input invalid username
		username1.sendKeys(username);
		TimeUnit.SECONDS.sleep(4);
		password1.sendKeys(password);
		TimeUnit.SECONDS.sleep(4);
		
		submit.click();
		
		String usernameerror = driver.findElement(By.id("error")).getText();
		
		
		if (usernameerror.equals("Your username is invalid!")) {
			
			System.out.println("Error message is correct");
			
		} else {
			
			System.out.println("Error message is incorrect");
		}
		
		
	
	
	}
	
	
	@SuppressWarnings("deprecation")
	@Test
	 public void NegativePasswordTest (String username, String password ) throws InterruptedException { 
		
		
		WebElement username1 = driver.findElement(By.xpath("//input[@id=\"username\"]"));
		WebElement password1 = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		WebElement submit = driver.findElement(By.xpath("//button[@id=\"submit\"]"));
		
		//Verify if the Elements are visible
		username1.isDisplayed();
		TimeUnit.SECONDS.sleep(4);
		password1.isDisplayed();
		TimeUnit.SECONDS.sleep(4);
		submit.isDisplayed();
		TimeUnit.SECONDS.sleep(4);
		
		//Input invalid username
		username1.sendKeys(username);
		TimeUnit.SECONDS.sleep(4);
		password1.sendKeys(password);
		TimeUnit.SECONDS.sleep(4);
		
		submit.click();
		
		String usernameerror = driver.findElement(By.id("error")).getText();
		
		
		if (usernameerror.equals("Your password is invalid!")) {
			
			System.out.println("Error message is correct");
			
		} else {
			
			System.out.println("Error message is incorrect");
		}
		
		
	
	
	}
	
	
	@SuppressWarnings("deprecation")
	@Test
	 public void PositiveTest (String username, String password ) throws InterruptedException { 
		
		
		WebElement username1 = driver.findElement(By.xpath("//input[@id=\"username\"]"));
		WebElement password1 = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		WebElement submit = driver.findElement(By.xpath("//button[@id=\"submit\"]"));
		
		//Verify if the Elements are visible
		username1.isDisplayed();
		TimeUnit.SECONDS.sleep(4);
		password1.isDisplayed();
		TimeUnit.SECONDS.sleep(4);
		submit.isDisplayed();
		TimeUnit.SECONDS.sleep(4);
		
		//Input invalid username
		username1.sendKeys(username);
		TimeUnit.SECONDS.sleep(4);
		password1.sendKeys(password);
		TimeUnit.SECONDS.sleep(4);
		
		submit.click();
		
		TimeUnit.SECONDS.sleep(4);
		
		//Verify if URL is correct
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://practicetestautomation.com/logged-in-successfully/" );
		
		String successmessage = driver.findElement(By.xpath("//p[@class=\"has-text-align-center\"]")).getText();
		
		System.out.print(successmessage);
		
		if (successmessage.equals("Congratulations student. You successfully logged in!")) {
			
			System.out.println("Student successfully logged in!");
			
		} else {
			
			System.out.println("Student did not successfully looged in!");
		}
		
		
		}
		
		
	
	
	
	
	
	@Test
	public void NegativeScenario1 () throws InterruptedException {
		
		NegativeUsernameTest("incorrectUser","Password123");
			
		
		
	}
	
	@Test
	public void NegativeScenario2 () throws InterruptedException {
		
		NegativePasswordTest("student","incorrectPassword");
			
		
		
	}
	
	@Test
	public void PositiveScenario () throws InterruptedException {
		
		PositiveTest("student","Password123");
			
		
		
	}
	
	@AfterSuite
    public void afterSuite() {
        driver.close();
    }
	
	
}
