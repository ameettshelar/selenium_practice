package PackA;

public class inherit extends arithmetic
{
	int x;
	int y;
    public inherit()
    {
    	 x=9;
    	 y=9;
    	
    	
    }
    
    public int add()
    {
		int c=x+y;
    	return c;
    	
    }
	public static void main(String[] args) 
	{
	 // inherit obj=new inherit();
	  //int a=obj.sum(100, 20);
	  //System.out.println(a);
	 // int b=obj.add();
	 // System.out.println(b);
		System.out.println(System.currentTimeMillis());
	}

}
