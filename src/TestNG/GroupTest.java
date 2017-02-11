package TestNG;

import org.testng.annotations.Test;

public class GroupTest 
{
  @Test(groups={"Sedan", "BMW"})
  public void BMW3Series() 
  {
    System.out.println("BMW3Series");
  }
  
  @Test(groups={"Sedan"})
  public void BMWX3()
  {
	  System.out.println("BMWX3");
  }
  
  @Test(groups={"Sedan"})
  public void AudiA6()
  {
	  System.out.println("AudiA6");
  }
  
  @Test(groups={"Honda"})
  public void HondAccord()
  {
	  System.out.println("HondAccord");
  }
}
