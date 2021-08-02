package testListeners;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestngExtendtreports1 {

	WebDriver driver; 
	

	@BeforeSuite
	public void setup() {
		 
		}
	
	@BeforeTest
	public void testSetup() {
			String projectPath = System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver", projectPath+ "\\drivers\\GeckoDriver\\geckodriver.exe" );
			//System.setProperty("webdriver.edge.driver", projectPath+ "\\drivers\\EdgeDriver\\msedgedriver.exe" );
			// driver = new EdgeDriver();

			driver = new FirefoxDriver();
			
	}


	@Test
	public  void OpeningBrowserFrom1() {
		
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
//		driver.quit();
		
	}

	@AfterSuite
	public void tearDown() {		
		
	}
}

