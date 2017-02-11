
public class arithmatic 
{
    //int x=10;
    //int y=20;
    
    public  int sum(int x, int y)
    {
		int c=x+y;
    	return c;
    	//System.out.println(x+y);
    	
    	
    }
	public static void main(String[] args) 
	{
		arithmatic obj = new arithmatic();
		int a=obj.sum(10, 20);
		System.out.println(a);

	}

}
