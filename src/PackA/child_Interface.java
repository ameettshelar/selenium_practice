package PackA;

public class child_Interface implements a_interface,b_interface 
{

	

	public void sum() 
	{
	 System.out.println(x+y);
		
	}

	
	public void sub() 
	{
		System.out.println(y-x);
		
	}

	public void multi() 
	{
	
		System.out.println(a*b);
	}
	
	
	public static void main(String[] args)
	{
	 
		a_interface obj = new child_Interface();
		obj.sum();
		obj.sub();
		b_interface obj1 = new child_Interface();
		obj1.multi();
	}




}
