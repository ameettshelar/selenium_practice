package PackA;
import java.util.ArrayList;
import java.util.List;

public class collections 
{

	public void trycollections()
	{
		List<String> l1 = new ArrayList<String>();
		List<String> l2 = new ArrayList<String>();
		l1.add("abc");
		l1.add("def");
		l1.add("ghi");
		l1.add("jkl");
		l1.add("mno");
		l1.add("pqr");
		
		System.out.println("List of the elements l1 are "+l1);
		
		
		
		for (String obj : l1)
		{
			System.out.println(obj);
		}
		
		l2.addAll(l1);
		System.out.println("List of the elements l2 are "+l2);
		
		l1.remove(3);
		System.out.println("After removing item at index 3");
		System.out.println("List of the elements l1 are "+l1);

	}
	public static void main(String[] args) 
	{
		collections obj = new collections();
		obj.trycollections();
	}

}
