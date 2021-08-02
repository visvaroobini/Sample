package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginPage {
	WebDriver driver  = null; 
	By userName =  (By.id("Username"));
	By password = (By.name("Password"));
	By loginButton = (By.id("button1"));
	
	public LoginPage(WebDriver driver)
	{
		this.driver =driver;
	}
	
	public void Login( ) {
		
	driver.findElement(userName).click();
	driver.findElement(userName).sendKeys("support746");
	driver.findElement(password).click();
	driver.findElement(password).sendKeys("Autoqa123");
	driver.findElement(loginButton).click();	
	

		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
