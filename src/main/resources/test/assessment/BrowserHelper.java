package assessment;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.SessionId;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import elements.PortalPage;
import io.github.bonigarcia.wdm.WebDriverManager;

import assessment.VerificationSteps;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class BrowserHelper  {

	public WebDriver driver;
	

	public WebDriver startbrowser (String URL ){
		
		WebDriverManager.edgedriver().setup();
		
		EdgeOptions options = new EdgeOptions();
		driver = new EdgeDriver(options);
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts();
		driver.manage().window().maximize();
		driver.get(URL);
		
		
		return driver;
		
		
		
		
	
	
		
		
		
	}
	
	
	
	
	
}
