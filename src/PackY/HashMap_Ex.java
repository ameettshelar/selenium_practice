package PackY;

import java.util.*;

public class HashMap_Ex {

	public static void main(String[] args) {
		HashMap<Integer, String> m=new HashMap<Integer, String>();
		
		m.put(101, "durga");
		m.put(102, "ravi");
		m.put(103, "anil");
		
		System.out.println(m);
		
		System.out.println(m.get(101));
		
		Set s=m.entrySet();
		
		System.out.println(s);
		
		for(Map.Entry<Integer, String> e :m.entrySet())
		{
			System.out.println("Key is "+e.getKey()+" and value is "+e.getValue());
		}
		
		

	}

}
