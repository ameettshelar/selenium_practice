package Webdriver_ex;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest 
{

 @Test(dataProvider="dp1")
 public void loginTest(String username, String Password) throws Exception
 {
	//System.setProperty("webdriver.chrome.driver", "E:\\Ameett\\ChromeDriver.exe");
	 WebDriver driver = new FirefoxDriver();
	 
	 driver.get("https://wss.mahadiscom.in/wss/wss?uiActionName=getCustAccountLogin");
	 
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 WebElement e1=driver.findElement(By.xpath(".//input[@name='loginId']"));
			 e1.sendKeys(username);
	 WebElement e2=driver.findElement(By.xpath(".//input[@name='password']"));
			 e2.sendKeys(Password);
		Thread.sleep(3000);
	e1.clear();
	e2.clear();
	
	driver.quit();
			 
	 
	 
 }
	
	


  @DataProvider
  public Object[][] dp1() 
  {
    return new Object[][] {{"abc", "demo123"} , {"xyz", "demo789"}};
  }
}

