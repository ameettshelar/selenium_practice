package Operators;

public class examplewhileloop 
{
	public void factorial(int n)
	{
		int a=1;
		for(int i=1;i<=n;i++)
		{
			a=i*a;
		}
		System.out.println(a);
	}

	public void for_loop_even(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);	
			}	
			
		}
	}
		
	public void for_loop(int n)
	{
		//int i;
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}
		
	}

	public void tentoone(int n)
	{
		int i=1;
		do
		{
			System.out.println(i);
			i++;
		}
		while (i<=n);
		
	}
	
	
	public void onetoten(int n)
	{
		int i=1;
		while (i<=n)
		{
			System.out.println(i);
			i++;
		}
		
	}
	
	public static void main(String[] args)
	{
		
		examplewhileloop obj = new examplewhileloop();
		//obj.onetoten(15);
		//obj.tentoone(0);
		//obj.for_loop(9);
		//obj.for_loop_even(10);
		obj.factorial(9);
	}

}
