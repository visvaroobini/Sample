package multiBrowserTests;

import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.remote.RemoteWebDriver;


public class SauceRemoteWebDriver {

		 public static void main(String[] args) throws Exception {
	 			 
		 MutableCapabilities sauceOptions = new MutableCapabilities();
		 sauceOptions.setCapability("username", "oauth-agathursamy.v-1306a");
		 sauceOptions.setCapability("accessKey", "ab78c042-f9e4-4a21-bef8-e3958b5e1355");
			 
		 DesiredCapabilities caps = DesiredCapabilities.chrome();
		 caps.setCapability("sauce:options", sauceOptions);
		 caps.setCapability("platform", "Windows 10");
		 caps.setCapability("version", "latest");
		 caps.setCapability("browserName", "chrome");
	   
		 WebDriver driver = new RemoteWebDriver(new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub"), caps);
		 driver.get("https://www.fourthhospitality.com/portal/default.asp?strCode=QC9059");
		 driver.manage().window().maximize();
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		 String  title = driver.getTitle();
		 System.out.println("PageTitle = " +title);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("TestCompleted");
			
			driver.close();
			System.out.println("TestCompleted from Git hub");
		 }
	}
