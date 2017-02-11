package PackA;

public class construct_ex 
{

	int x;
	int y;
	
	public construct_ex()
	{
		x=9;
		y=10;
	}
	public construct_ex(int a, int b) 
	{
	  x=a;
	  y=b;
	  //System.out.println(x);
	  //System.out.println(y);
	}
		
	public void display()
	{
		System.out.println(x);
		System.out.println(y);
		
	}
	public static void main(String[] args) 
	{
		construct_ex con1 = new construct_ex();
		construct_ex con2 = new construct_ex(7, 8);
		con1.display();
		con2.display();
		

	}

}
