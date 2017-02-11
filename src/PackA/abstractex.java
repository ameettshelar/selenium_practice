package PackA;

public abstract class abstractex 
{

    int x=19;
    int y=10;
    
    public abstract void sub();
    public void sum()
    {
    	System.out.println(x+y);
    	
    }
    		
	public static void main(String[] args) 
	{
		  abstractex obj = new child_abstract();
		  obj.sub();
		  obj.sum();

	}

}
