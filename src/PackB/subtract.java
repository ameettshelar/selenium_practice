package PackB;




public class subtract 
{
	int x=3;
	int y=4;
	
	public void sub()
	{
		System.out.println(y-x);
		
	}
	
	public void userdir()
	{
		//String s= System.getProperty("user.dir");
		System.out.println(System.getProperty("user.dir"));
	}
	public static void main(String[] args) 
	{
	  subtract o1=new subtract();
	  o1.userdir();
	  //o1.sub();
	  
	 // PackA.arithmetic o2 = new PackA.arithmetic();
	 // System.out.println(o2.sum(5, 10));
	  
	 // PackC.arithmetic o3 = new PackC.arithmetic();
	 // System.out.println(o3.sum(5, 10));
	}

}
