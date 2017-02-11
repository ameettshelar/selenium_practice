package PackA;

public class child_overriding extends a_overriding
{

	public void eat()
	{
		System.out.println("hi");
	}
	public static void main(String[] args) 
	{
		a_overriding obj = new child_overriding();
		obj.eat();

	}

}
