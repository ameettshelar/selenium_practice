package Operators;

public class greaternumber 
{
    public void grtnum(int x, int y, int z)
    {
    	if(x>y && x>z)
    	{
    		System.out.println(x +" is greater");
    	}	
    	else if(y>x && y>x)
    	{
    		System.out.println(y +" is greater");
    	}	
    	else if(z>x && z>x)
    	{
    		System.out.println(z +" is greater");
    	}	
    	else 
    	{
    		System.out.println("Number is invalid");
    	}	
    	
    }
	public static void main(String[] args)
	{
		greaternumber obj = new greaternumber();
		obj.grtnum(11, 15, 9);

	}

}
