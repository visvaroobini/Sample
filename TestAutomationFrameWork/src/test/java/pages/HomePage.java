package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage  extends BasePage {
	
	
	protected HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
    By modulesList =  By.name("cboModules");  
	
//	public HomePage(WebDriver driver) 
//	{
//	this.driver = driver; 	
//	}
	
	public void SelectHr( )
	{
		this.Driver.switchTo().frame("header"); //main
		WebElement element = this.Driver.findElement(By.id("Start"));

//
		//List<WebElement> modulesList = driver.findElements(By.name("cboModules"));

//		WebElement modulesSelector = driver.findElement(By.name("cboModules"));  
//		Select module = new Select(modulesSelector);  
//    	module.selectByVisibleText("HR");

       this.Driver.findElements((By) modulesList);
       String modules = this.Driver.findElement((By)modulesList).getText();
       
       int modulesCount = this.Driver.findElements((By)modulesList).size();
       System.out.println(modulesCount);
       System.out.println(modules);
       
       Select moduleSelect = new Select(this.Driver.findElement(By.name("cboModules")));  
       moduleSelect.selectByVisibleText("HR");
	}
}
