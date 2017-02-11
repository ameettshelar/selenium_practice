package PackY;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShots 
{

	public String timeStamp()
	{
		String ts="";
		
		Date dt=new Date();
		
		SimpleDateFormat sdf=new SimpleDateFormat("ddMMyyHHmmSS");
		
		ts=sdf.format(dt);
		return ts;
		
	}
	
	public static void main(String[] args)
	{
		ScreenShots ss=new ScreenShots();
		System.out.println(ss.timeStamp());
		Date dt=new Date();
				System.out.println(dt.toString());
		
	}
}