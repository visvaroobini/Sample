package waitsTest;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static Extentions.Waits.*;

public class ExplicitWaitTest {

		WebDriver driver; 
	
		@BeforeTest
		public void testSetup() {
			
				String projectPath = System.getProperty("user.dir");
				System.setProperty("webdriver.chrome.driver", projectPath+ "\\drivers\\ChromeDriver\\chromedriver.exe" );
				
				driver = new ChromeDriver();
				
			
			System.out.println("launched  browser");
		}


		public  void ExplicitWait() {
			
			WebDriverWait wait = new WebDriverWait(driver,10);
			
			driver.get("https://www.fourthhospitality.com/portal/default.asp?strCode=QC9059");
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("XXX")));
			element.click();
			driver.manage().window().maximize();
		}
		
@Test
		public  void FluentWait() {
		driver.get("https://www.fourthhospitality.com/grouplistlive.asp?allowlist=1");
		System.out.println("Live APP Browser");
		WebElement element = driver.findElement(By.className("GL_summarytext"));
		System.out.println("WaitingForloginButton");
		String text = "Please enter a valid PIN and press the LOGIN button.";
		waitForElementWithText(element, text, driver);
			
		System.out.println("Pinentered and in list apge");
		////WebElement element1 = driver.findElement(By.className("GL_GL_pagetitle"));
		waitForlocatorWithText(By.className("GL_GL_pagetitle"), "welcome to the fourth", driver );
		}

		@AfterTest
		public void afterTestSetup() {
			driver.close();
//			driver.quit();		
		}
}

