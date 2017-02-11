package TestNG;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import TestNG.FacSimpleTest;

@SuppressWarnings("unused")
public class FacAnnotation {
 
	
  @Factory
  public Object[] facAnno() {
	return new Object[]{new FacSimpleTest(0),new FacSimpleTest(1)};
  }
}
