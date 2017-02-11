package Webdriver_ex;

import java.util.*;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {

	private static Map<String, WebDriver> drivers=new HashMap<String, WebDriver>();
	
	static WebDriver driver=null;
	
	public static WebDriver getBrowser(String browserName)
	{
	   driver=drivers.get(browserName);	
       
	   if(driver==null)
       {
    	   switch(browserName)
    	   {
    	   case "Firefox":
    		   driver=new FirefoxDriver();
    	   break;
    	   
    	   case "IE" :
    	       System.setProperty("webdriver.ie.driver", "E:\\Ameett\\IEDriverServer.exe");
    	       driver=new InternetExplorerDriver();
    	   break;
    	   
    	   case "Chrome":
    	       System.setProperty("webdriver.chrome.driver", "E:\\Ameett\\ChromeDriver.exe");
    	       driver=new ChromeDriver();
    	   break;	   
    	   }
    	  drivers.put(browserName, driver); 
       }
		return driver;
	}
	
	public static void closeAllBrowsers()
	{
		for(String key : drivers.keySet())
		{
			drivers.get(key).close();
			drivers.get(key).quit();
		}
		
	}
	
	
}
