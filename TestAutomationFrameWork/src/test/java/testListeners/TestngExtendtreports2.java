package testListeners;



	import java.io.IOException;

	import org.apache.logging.log4j.LogManager;
	import org.apache.logging.log4j.Logger;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.Status;
	import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

	public class TestngExtendtreports2 {
	
		 WebDriver driver; 
	
		@BeforeSuite
		public void setup() {
			 
			}
		
		@BeforeTest
		public void testSetup() {
				String projectPath = System.getProperty("user.dir");
				System.setProperty("webdriver.chrome.driver", projectPath+ "\\drivers\\ChromeDriver\\chromedriver.exe" );
			    driver = new ChromeDriver();
				
		}


		@Test
		public  void OpenBrowserFrom2() {
					
			driver.get("https://www.fourthhospitality.com/portal/default.asp?strCode=QC9059");
			driver.manage().window().maximize();
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		}
		
		@AfterTest
		public void afterTestSetup() {
			driver.close();
//			driver.quit();
			
		}

		@AfterSuite
		public void tearDown() {		
			
		}
	}


