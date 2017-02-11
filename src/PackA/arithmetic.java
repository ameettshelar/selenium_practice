package PackA;



public class arithmetic 
{
    //int x=10;
    //int y=20;
    
    public  int sum(int x, int y)
    {
		int c=x*y;
    	return c;
    	//System.out.println(x+y);
    	
    	
    }
	public static void main(String[] args) 
	{
		arithmetic obj = new arithmetic();
		int a=obj.sum(10, 20);
		System.out.println(a);

	}

}
