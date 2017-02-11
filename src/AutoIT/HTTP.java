package AutoIT;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HTTP {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		Runtime.getRuntime().exec("E:\\interview\\AutoITScripts\\HTTPAuthentication.exe");
		driver.get("http://rsyspedia.india.rsystems.com");
		
		
		
		Thread.sleep(3000);
		driver.quit();

	}

}
