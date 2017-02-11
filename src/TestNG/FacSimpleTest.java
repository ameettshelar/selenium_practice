package TestNG;

import org.testng.annotations.Test;

public class FacSimpleTest {
 
	private int param;
	
	public FacSimpleTest(int param){
		this.param=param;
	} 
	
  @Test
  public void tm1() {
	  int val=param+1;
	  System.out.println("Test Method one "+val);
  }
  
  @Test
  public void tm2() {
	  int val=param+2;
	  System.out.println("Test Method two "+val);
  }

}
