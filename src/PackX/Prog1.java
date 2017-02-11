package PackX;
import  PackY.*;
public class Prog1 
{

	public void area(int w, int l)
	{
		System.out.println("Area of Rectangle is "+(w*l));
	}
	
	public void area(float b, float h)
	{
		System.out.println("Area of Triangle is "+((b*h)/2));
	}
	
	public void area(float r)
	{
		System.out.println("Area of Circle is "+(r*r*3.14));
	}
	
	public void primeNos(int x)
	{
		System.out.println("Prime nos are -"); 
		int n;
		for(n=2; n<=x; n++)
		{
			int cnt;
			for(cnt=2; cnt<=n-1; cnt++)
			{
				if(n%cnt==0)
				{
				 break;
				}
				
			}
		 if(cnt==n)
		 {
			 System.out.println(n); 
		 }
			
		}	
	}
	
	public void sum(int a, int b)
	{
		System.out.println("Sum of two nos. is "+(a+b));
	}

	public void printstar()
	{
	  //int cnt=5;
	  //int hcnt;
	  //int vcnt;
	  
	  //for (vcnt=1; vcnt)
	}
	public static void main(String[] args)
	{
		Prog1 obj = new Prog1();
		obj.area(6);
		obj.area(3, 6);
		obj.area(5, 6);
		obj.primeNos(51);
		obj.sum(5, 7);
		
		called obj2=new called();
		obj2.sum(6, 7, 8);
		System.out.println("*");

	}

}
