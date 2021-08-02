package test;



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
		ExtentHtmlReporter htmlReporter;
		ExtentReports extent;
		 WebDriver driver; 
		 ExtentTest test;
		 Logger log = LogManager.getLogger(TestngExtendtreports1.class);
		
		@BeforeSuite
		public void setup() {
			 htmlReporter = new ExtentHtmlReporter("TestNGReports2.html");
			 extent = new ExtentReports();
			 extent
				.attachReporter(htmlReporter);
			 log.info("BeforeTest suite Executed");
			}
		
		@BeforeTest
		public void testSetup() {
				String projectPath = System.getProperty("user.dir");
				System.setProperty("webdriver.chrome.driver", projectPath+ "\\drivers\\ChromeDriver\\chromedriver.exe" );
			    driver = new ChromeDriver();
				log.info("Before Test Executed for Chrome driver");
		}


		@Test(priority = 0)
		public  void Test1() {
		
			
			test = extent.createTest("LoginTest", "A login test");
			test.log(Status.INFO, "Starting Test in Chrome Browser");
			driver.get("https://www.fourthhospitality.com/portal/default.asp?strCode=QC9059");
			driver.manage().window().maximize();
			log.info("Test Execution started");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			test.pass("Browser Launched sucessfully in Chrome Browser");
			try {
				test.addScreenCaptureFromPath("LoginpageScreenshot.Png");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			log.info("Test Execution Complted for Chrome Browser");
		}
		

		@Test(priority = 1)
		public  void Test2() {
			System.out.println("Completed Test 2 Second as per the priority in Chrome Browser");
		}
		
		@AfterTest
		public void afterTestSetup() {
			driver.close();
//			driver.quit();
			test.info("Browswer closed in Chrome Browser");	
			log.info("After Test Execution Completed  for Chrome Browser");
		}

		@AfterSuite
		public void tearDown() {		
			extent.flush();
			test.info("Extend report created in Chrome Browser");	
			log.info("After Test Suite Execution Completed  for Chrome Browser  Extended reports2");
		}
	}


