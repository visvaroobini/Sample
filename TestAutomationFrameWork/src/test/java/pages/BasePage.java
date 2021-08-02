package pages;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
	
	protected BasePage(WebDriver driver)
	{
		this.Driver = driver;
	}
	

    protected WebDriver Driver; 
}

