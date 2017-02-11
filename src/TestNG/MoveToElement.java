package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MoveToElement 
{
  @Test
  public void hdfcexample() 
  {
    WebDriver driver = new FirefoxDriver();
    driver.get("http://www.hdfcbank.com/personal/products/loans");
    driver.manage().window().maximize();
    
    /*WebElement prod = driver.findElement(By.linkText("Products"));
  Actions a1=new Actions(driver);
  a1.moveToElement(prod).build().perform();
  
  WebElement Inv = driver.findElement(By.linkText("Investments"));
  a1.moveToElement(Inv).build().perform();
  
  WebElement invtra=driver.findElement(By.linkText("InvestTrack"));
  a1.moveToElement(invtra).build().perform();*/
		  
  WebElement popup = driver.findElement(By.cssSelector(".closebtn"));
  popup.click();
  
  }
}
