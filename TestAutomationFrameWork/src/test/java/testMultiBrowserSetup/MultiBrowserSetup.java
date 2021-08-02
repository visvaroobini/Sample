package testMultiBrowserSetup;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class MultiBrowserSetup {
	WebDriver driver; 
	
	
	@BeforeTest
	@Parameters("browser")
	public void testSetup(String browser) {
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.out.println("Starting ThreadCount"+Thread.currentThread().getId());
			String projectPath = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", projectPath+ "\\drivers\\ChromeDriver\\chromedriver.exe" );
			
			driver = new ChromeDriver();
			}
		else if(browser.equalsIgnoreCase("firefox") ) {
			System.out.println("Starting ThreadCount"+Thread.currentThread().getId());
			String projectPath = System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver", projectPath+ "\\drivers\\GeckoDriver\\geckodriver.exe" );
			driver = new FirefoxDriver();
			
		}
		else if(browser.equalsIgnoreCase("edge")) {
			System.out.println("Starting ThreadCount"+Thread.currentThread().getId());
			String projectPath = System.getProperty("user.dir");
			System.setProperty("webdriver.edge.driver", projectPath+ "\\drivers\\EdgeDriver\\msedgedriver.exe" );
			driver = new EdgeDriver();	
		}
		System.out.println("launched "+ browser);
	}


	@Test
	public  void Test1() {
		
		driver.get("https://www.fourthhospitality.com/portal/default.asp?strCode=QC9059");
		driver.manage().window().maximize();

	}
	

	@AfterTest
	public void afterTestSetup() {
		driver.close();
//		driver.quit();
	
	}

}
