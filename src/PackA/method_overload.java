package PackA;

public class method_overload 
{
    public int sum (int a, float b)
    {
    	int c=(int) (a+b);
    	return c;
    }

    public void sum (double a, double b)
    {
    	System.out.println(a+b);
    }

    public void sum (double a, float b)
    {
    	System.out.println(a+b);
    }


	public static void main(String[] args) 
	{
		method_overload obj = new method_overload();
		System.out.println (obj.sum(10, 9.6f));
		obj.sum(10.5, 20);
		obj.sum(10, 20.3);
		
		
		
		
	}

}
