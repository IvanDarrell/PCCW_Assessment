package elements;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.ExtentReports;




public class PortalPage {


	
	@FindBy(xpath="//p//a[@href=\"#/shop\"]")
	public WebElement StartShopping;
	
	
	
	

}
