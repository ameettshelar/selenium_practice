package Operators;

public class ifelsecondition 
{
	public void modnum (int n)
	{
		if(n%2 == 0)
		{
			System.out.println("Number is even");
		}	
		else
		{
			System.out.println("Number is odd");
		}
	}
	
	
	public static void main(String[] args)
	{
		ifelsecondition obj = new ifelsecondition();
		obj.modnum(15);
		
	}

}
