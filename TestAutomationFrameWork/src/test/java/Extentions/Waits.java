package Extentions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public final class Waits {
	

	
	public static void waitForElementWithText(WebElement element, String text, WebDriver driver) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			    .withTimeout(Duration.ofSeconds(30)) 
			    .pollingEvery(Duration.ofSeconds(1))
			    .withMessage("Fail after Fluent wait")
			    .ignoring(NoSuchElementException.class);
			
			wait.until(ExpectedConditions.textToBePresentInElement(element, text));		
	}
	
	public static void waitForlocatorWithText(By locator, String text,  WebDriver driver) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			    .withTimeout(Duration.ofSeconds(30)) 
			    .pollingEvery(Duration.ofSeconds(1))
			    .withMessage("Fail after Fluent wait")
			    .ignoring(NoSuchElementException.class);
			
			wait.until(ExpectedConditions.textToBe(locator, text));
				
//			WebElement element =  wait.until(new Function<WebDriver, WebElement>() {
//                 public WebElement apply(WebDriver driver) {
//                 return driver.findElement(By.id("Start"));
//                   }
//                 });
//			element.click();
	}	
}
