package AutoIT;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoIT_Ex {

	public static void main(String[] args) throws Exception {
		
		String baseURL="https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier";
		System.setProperty("webdriver.chrome.driver", "E:\\Ameett\\chromedriver.exe");
		//String baseURL="www.gmail.co.in";
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-extensions");
		
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver(options);
		
		driver.get(baseURL);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		
		WebElement UserName=driver.findElement(By.xpath(".//*[@id='Email']"));
		
		WebElement btnNext=driver.findElement(By.xpath(".//*[@id='next']"));
		
        UserName.sendKeys("amit8755");
		
		btnNext.click();
		
		WebElement PSW=driver.findElement(By.xpath(".//*[@id='Passwd']"));
		
		PSW.sendKeys("ameett@15a");
		
		driver.findElement(By.xpath("//*[@id='PersistentCookie']")).click();;
		
		
		WebElement btnsignIn=driver.findElement(By.xpath(".//*[@id='signIn']"));
		
		btnsignIn.click();
		
		WebElement compo=driver.findElement(By.xpath("//div[text()='COMPOSE']"));
		compo.click();
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id=':qa']")));
		
		WebElement attach = driver.findElement(By.xpath(".//*[@id=':qa']"));
		attach.click();
		
		Thread.sleep(5000);
		
		String drv="chrome";
		if(drv.equalsIgnoreCase("firefox"))
		   Runtime.getRuntime().exec("E:\\interview\\AutoITScripts\\uploadfile.exe");
		else
			Runtime.getRuntime().exec("E:\\interview\\AutoITScripts\\uploadfile_chrome.exe");
			
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id=':lj']"))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span"))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='gb_71']"))).click();
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
