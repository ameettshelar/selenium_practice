package Webdriver_ex;

import org.openqa.selenium.*;


public class g99_Login {

	public static void Login_G99() 
	{
		WebDriver driver=BrowserFactory.getBrowser("Firefox");
		driver.get("http://www.demo.guru99.com/V4/");
		driver.manage().window().maximize();
		
		
		WebElement txtLogin=driver.findElement(By.name("uid"));
		WebElement txtPsw=driver.findElement(By.name("password"));
		
		txtLogin.sendKeys("mngr50957");
		txtPsw.sendKeys("avyrAbE");
		
		WebElement btnSubmit=driver.findElement(By.name("btnLogin"));
		btnSubmit.click();
		
		//driver.manage().wait(2000);
		//Verify login is successful
		String actURL="Guru99 Bank Manager HomePage";
		String expURL=driver.getTitle();
		
		System.out.println(expURL);
		
		if(expURL.equalsIgnoreCase(actURL))
		{
			System.out.println("Login Successfull");
		}
		else
		{
			System.out.println("Login failed");
		}
		
	}
	
	public static void main(String[] args) {
		
		Login_G99();
	
		

	}

}
