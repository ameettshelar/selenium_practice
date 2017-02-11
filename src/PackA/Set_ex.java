package PackA;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_ex 
{
    public void setcollectionHash()
    {
    	Set<String> c1 = new HashSet<String>();
    	c1.add("abc");
		c1.add("def");
		c1.add("ghi");
		c1.add("jkl");
		c1.add("mno");
		c1.add("mno");
    	
		System.out.println("Hashset "+c1);
    }
	
    public void setcollectionLinkedHash()
    {
    	Set<String> c1 = new LinkedHashSet<String>();
    	c1.add("abc");
		c1.add("def");
		c1.add("ghi");
		c1.add("jkl");
		c1.add("mno");
		c1.add("mno");
    	
		System.out.println("LinkedHashset "+c1);
    }

    public void setcollectionTreeSet()
    {
    	Set<String> c1 = new TreeSet<String>();
    	c1.add("abc");
		c1.add("wxy");
		c1.add("mnp");
		c1.add("jkl");
		c1.add("klo");
		c1.add("klo");
    	
		System.out.println("Treeset "+c1);
    }
    public void setcollectionremove()
    {
    	Set<String> c1 = new TreeSet<String>();
    	c1.add("abc");
		c1.add("wxy");
		c1.add("mnp");
		c1.add("jkl");
		c1.add("klo");
		c1.add("klo");
    	
		c1.remove("jkl");
		System.out.println("Treeset "+c1);
    }

    public static void main(String[] args) 
	{
		Set_ex obj = new Set_ex();
		obj.setcollectionHash();
		obj.setcollectionLinkedHash();
		obj.setcollectionTreeSet();
		obj.setcollectionremove();
	}

}
