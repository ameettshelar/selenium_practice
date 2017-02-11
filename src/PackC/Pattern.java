package PackC;

import java.util.Scanner;

public class Pattern
{

	public void print123(int n)
	{
		
		for(int i=1; i<=n; i++)
		{
			String pat="";
			for (int j=1; j<=i; j++)
			{
				pat=pat+j+" ";
			}
		  System.out.println(pat.trim());	
		}
		
	}
	
	public void print122333(int n)
	{
		for (int i=1; i<=n; i++)
		{
			String pat="";
			for(int j=1; j<=i; j++)
			{
				String rpat="";
				for (int x=1; x<=j; x++)
				{
					rpat=rpat+j;
				}
				pat=pat+rpat+" ";
			}
			System.out.println(pat.trim());
		}
		
	}
	
	public void starUp(int n)
	{
		for(int i=1; i<=n; i++)
		{
			String x="";
			for(int j=1; j<=i; j++)
			{
				x=x+"*"+" ";
			}
			System.out.println(x.trim());
		}
	}
	
	public void starDown(int n)
	{
		for(int i=n; i>=1; i--)
		{
			String x="";
			for(int j=i; j>=1; j--)
			{
				x=x+"*"+" ";
			}
			
			System.out.println(x.trim());
		}
	}
	
	public void star122333(int n)
	{
		for (int i=1; i<=n; i++)
		{
			String pat="";
			for(int j=1; j<=i; j++)
			{
				String rpat="";
				for (int x=1; x<=j; x++)
				{
					rpat=rpat+"*";
				}
			 pat=pat+rpat+" ";
			}
		   System.out.println(pat);
		}
	}

	public void starPyramid()
	{
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows=scn.nextInt();
		
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=rows-i; j++)
			{
				System.out.print(" ");
			}
		
			for(int j=1; j<=(2*i)-1; j++)
			{
				System.out.print("*");
			}
		    System.out.println();	
		}
	}
	
	public void starPyramidDownward(int rows)
	{
		for(int i=rows; i>=1; i--)
		{
			for(int j=1; j<=rows-i; j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1; j<=2*i-1; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) 
	{
       Pattern p=new Pattern();
       //p.print123(9);
      // p.print122333(9);
       //p.starUp(5);
      // p.starDown(5);
       //p.star122333(5);
       //p.starPyramid();
       p.starPyramidDownward(9);
	}

}
