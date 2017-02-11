package PackA;

public class child_abstract extends abstractex
{

	
	public void sub() 
	{
	 System.out.println(x-y);	
	}
    
	public void multi()
	{
		System.out.println(x*y);	
	}
	
	public static void main(String[] args) 
	{
	  abstractex obj = new child_abstract();
	  obj.sub();
	  obj.sum();
	  
	  child_abstract obj1 = new child_abstract();
	  obj1.multi();
		
	}

	

}
