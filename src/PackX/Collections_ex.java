package PackX;

import java.util.*;

public class Collections_ex 
{
    public void arraylist_iterator()
    {
	  
      ArrayList<String> a1 = new ArrayList<String>();
	  a1.add("Ravi"); 
	  a1.add("Vijay");  
	  a1.add("Ravi");  
	  a1.add("Ajay"); 
	  
	  Iterator<String> itr=a1.iterator();
	  while(itr.hasNext())
	  {
		  System.out.println(itr.next());
	  }
    }
	
    public void arraylist_foreach()
    {
	  
      ArrayList<String> a1 = new ArrayList<String>();
	  a1.add("Ravi"); 
	  a1.add("Vijay");  
	  a1.add("Ravi");  
	  a1.add("Ajay"); 
	  
	  for (String obj : a1)
	  {
		  System.out.println(obj);
	  }
    }
	
    public void arraylist_listiterator()
    {
	  
      ArrayList<String> a1 = new ArrayList<String>();
      a1.add("Amit");  
      a1.add("Vijay");  
      a1.add("Kumar");  
      a1.add(1,"Sachin");  

      System.out.println(a1.get(2));
      System.out.println(a1.hashCode());
      /*ListIterator<String> lstItr = a1.listIterator(); 
      
      while(lstItr.hasNext())
      {
    	  System.out.println(lstItr.next());  
      }
      
      while(lstItr.hasPrevious())
      {
    	  System.out.println(lstItr.previous());  
    	  
      }*/
    }
	
	public static void main(String[] args)
	{
		Collections_ex obj = new Collections_ex();
		//obj.arraylist_iterator();
		//obj.arraylist_foreach();
		obj.arraylist_listiterator();
	}

}
