import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowserTest {

	public static void main(String[] args) {

		String projectPath = System.getProperty("user.dir");
		//System.setProperty("webdriver.gecko.driver", projectPath+ "\\drivers\\GeckoDriver\\geckodriver.exe" );
		//WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", projectPath+ "\\drivers\\ChromeDriver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();

		//System.setProperty("webdriver.edge.driver", projectPath+ "\\drivers\\EdgeDriver\\msedgedriver.exe" );
		//WebDriver driver = new EdgeDriver();

		driver.get("https://www-qai.fourthhospitality.com/portal/default.asp?strCode=SOHO127");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//driver.switchTo().alert().accept();;
		driver.findElement(By.id("button3")).click();		
		try {
			Thread.sleep(3000);
			} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.switchTo().frame("id of the element");
		
		WebElement userName =  driver.findElement(By.id("Username"));
		WebElement password = driver.findElement(By.name("Password"));
		WebElement loginButton = driver.findElement(By.id("button1"));
		
		userName.click();
		userName.sendKeys("support");
		password.click();
		password.sendKeys("lego66");
		loginButton.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.switchTo().frame("header"); //main
		
		
		List<WebElement> modulesList = driver.findElements(By.name("cboModules"));
		String modules = driver.findElement(By.name("cboModules")).getText();
		int modulesCount = modulesList.size();
		System.out.println(modulesCount);
		System.out.println(modules);
		
		WebElement modulesSelector = driver.findElement(By.name("cboModules"));  
		Select module = new Select(modulesSelector);  
		module.selectByVisibleText("HR");
		
		//driver.close();
	}
}
