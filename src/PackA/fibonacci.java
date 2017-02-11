package PackA;

public class fibonacci 
{

	public void displayfibonacci(int x)
	{
		int m=1,n=1, p, cnt=2;
		System.out.print(m+" "+n+" ");
		while (cnt<=x)
		{
	   		p=m+n;
	   		System.out.print(p+" ");
			m=n;
			n=p;
			cnt=cnt+1;
		}
	}
	
	public void printstar(int y)
	{
		int cnt;
		for(cnt=1; cnt<=y; cnt++)
		{
			int x;
			for(x=1; x<=cnt; x++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
			
	}	
		public void printstardown(int y)
		{
			int cnt;
			for(cnt=y; cnt>0; cnt--)
			{
				int x;
				for(x=1; x<=cnt; x++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		
	    }
		
		public void palindrome(int x)
		{
			int num, sum=0, r;
			num=x;
			while(num>0)
			{
				r=num%10;
				sum=(sum*10)+r;
				num=num/10;
			}
			
			if(sum==x)
			{
				System.out.println("Given number "+x+" is palindrome");
			}
			else
			{
				System.out.println("Given number "+x+" is not palindrome");	
			}
			
	    }

	public void reversString()
	{
		
		String str="This is my, Program";
	    String[] words=str.split(" ");
	    
	    
	    String revstr="";
	    
	    
	    for (int cnt=0; cnt<words.length; cnt++)
	    {
	    	String chk = null;
	    	String s2 = null;
	    	String temp="";
	       for(int cc=words[cnt].length()-1; cc>=0; cc--)
	       {
	    	  
	    	   char ch=words[cnt].charAt(cc);
	    	   String s1=Character.toString(ch);
	    	   if(!s1.equalsIgnoreCase(","))
	    	   {
	    		   temp=temp+s1; 
	    	   }
	    	   else
	    	   {
	    		   chk="1";
	    		   s2=s1;
	    	   }
	
	       }
    	   if(chk=="1")
    	   {
    		   
			temp=temp+s2;
			
    	   }	    	
	       revstr=revstr+temp+" ";
	    }
	    System.out.println(revstr.trim());		
	}
	
	
	
	public static void main(String[] args) 
	{
		
		fibonacci obj = new fibonacci();
		//obj.displayfibonacci(10);
		//obj.printstar(10);
		//obj.printstardown(10);
		//obj.palindrome(445);
		obj.reversString();
		
		
		
	}

}
