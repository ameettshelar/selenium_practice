package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericMethods {

	WebDriver driver;
	WebElement element;
	WebDriverWait wait;
	
	public GenericMethods(WebDriver driver){
		this.driver=driver;
	}
	
	public WebElement waitForPresence(By locater, int timeout){
		
		try{
			
			wait=new WebDriverWait(driver, timeout);
			element=wait.until(ExpectedConditions.presenceOfElementLocated(locater));
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return element;
	}
	
	public WebElement waitForVisibile(By locater, int timeout){
		
		try{
			
			wait=new WebDriverWait(driver, timeout);
			element=wait.until(ExpectedConditions.visibilityOfElementLocated(locater));
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return element;
	}

	public WebElement waitForClickable(By locater, int timeout){
		
		try{
			
			wait=new WebDriverWait(driver, timeout);
			element=wait.until(ExpectedConditions.elementToBeClickable(locater));
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		return element;
	}
	
}
