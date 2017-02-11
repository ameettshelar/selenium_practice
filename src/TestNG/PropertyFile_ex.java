package TestNG;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PropertyFile_ex 
{
  WebDriver driver ;
  Properties prop = new Properties();
  
  @BeforeClass
  public void beforeClassActivities() throws IOException 
  {
	  driver = new FirefoxDriver();

	  FileInputStream fis = new FileInputStream("C:/Users/pc/workspace/TestUser/selenium/PropertyFiles/LoginCredentials.dataproperty");
	  prop.load(fis);

	  FileInputStream fis1 = new FileInputStream("C:/Users/pc/workspace/TestUser/selenium/PropertyFiles/ObjectRepository.dataproperty");
	  prop.load(fis1);


	  
  }
  
  @Test(priority=0)
  public void InvokeBrowser() 
  {
    
	  
	  driver.get(prop.getProperty("url"));
	  driver.manage().window().maximize();
  }
  
  @Test(priority=1)
  public void login()
  {
	  driver.findElement(By.xpath(prop.getProperty("uidTextBox"))).sendKeys(prop.getProperty("UID"));
	  driver.findElement(By.xpath(prop.getProperty("pwdTextBox"))).sendKeys(prop.getProperty("PWD"));
	  driver.findElement(By.name(prop.getProperty("goButton"))).click();
	  driver.close();
	  
  }
  
}
