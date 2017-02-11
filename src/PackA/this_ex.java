package PackA;

public class this_ex 
{
   int variable=5;
   
   public void method(int variable)
   {
	   //System.out.println(variable);
	   System.out.println(this.variable);
   }
	
   public void method()
   {
	   int variable = 60;
	   System.out.println(variable);
	   //System.out.println(this.variable);
   }
	
	public static void main(String[] args) 
	{
		this_ex obj = new this_ex();
		obj.method(20);
		obj.method();
		
	}

}
