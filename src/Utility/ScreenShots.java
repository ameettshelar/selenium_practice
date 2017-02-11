package Utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShots {

	public static String timeStamp(){
		
		String ts=null;
		
		Date dt=new Date();
		
		SimpleDateFormat sf=new SimpleDateFormat("ddMMyyHHmmSS");
		
		ts=sf.format(dt);
		
		return ts;
	}
	
	public String takeScreenShot(WebDriver driver, String testcasename){
		
		String fname = testcasename+ScreenShots.timeStamp();
		
		String fpath="E://SeliniumReports//Screenshots//"+fname+".png";
		
		File destFile=new File(fpath);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return fpath;
	}
	
}
