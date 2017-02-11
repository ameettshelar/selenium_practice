package PackA;

public class StringPrograms
{
	static char[] c= new char[123];
	static int top=-1;
	
	public static void m1(char ch) //method to find unique character in the string and fill it in the character array 'c'
	{
		//int j=0;
		boolean b=true;
		
		if(top==-1) //fill the first slot in the array
		{
			c[++top]=ch;
		}
		
		for(int j=0; j<=top; j++)//loop through array to find if character is unique
		{
			if(c[j]==ch)
			{
				b=false;
				break;
			}
		}
		
		if(b==true)//if character is unique then fill it in the array in the next(top index is increased)slot
		{
			c[++top]=ch;
		}
	}
	
	
	public void nrepatingchar(String s, int n)
	{
		int len=s.length(); //given string length
		
		for(int i=0; i<len; i++)
		{
			m1(s.charAt(i));
		}
		
		int w1=0;
		for(int i=0; i<=top; i++)//loop through char array to find out repeating character
		{
			int w=0;
			for(int j=0; j<len; j++)//loop through the string and check every character in the string
			{
				if(c[i]==s.charAt(j))
				{
				  w++;	// it will add if character is repeating
				}
				
				if(w>1)//it will check for repeating character
				{
					w1++; //it will add for the number of repeating character
					break;
				}	
			}
			
			if(w1==n)// it will check the nth repeating character
			{
				System.out.println("The "+n+" repeating character is "+c[i]);
				break;
			}
		}
	}

	public void uniqueCharacter(String s)
	{
		int[] intarr=new int[123];
		String str="";
		int len=s.length();
		char ch;
		for(int i=0; i<len; i++)//loop through string characters
		{
			ch=s.charAt(i);
			intarr[ch]=1;
		}
		
		for(int i=0; i<123; i++)//loop through array
		{
			if(intarr[i]==1)
			{
				str=str+" "+(char)i;
			}
		}
		
		System.out.println("The unique characters in the given string are \""+str.trim()+"\"");
	}
	
	public void numberOfTimesCharaterIsRepeating(String s)
	{
		int[] intarr=new int[123];
		char ch;
		
		for(int i=0; i<s.length(); i++)
		{
			ch=s.charAt(i);
			intarr[ch]+=1;
		}
		
		for(int i=0; i<123; i++)
		{
			if(intarr[i]>1)
			{
			  System.out.println("Character \""+(char)i+"\" is repeating "+intarr[i]+ " times");
			}
		}
	}
	
	public void reverseWordsInString(String s)
	{
		String[] words=s.split(" ");
		String w="";
		for(int i=0; i<words.length; i++)
		{
			String str="";
			for(int j=words[i].length()-1; j>=0; j--)
			{
				str=str+words[i].charAt(j);
			}
			w=w+str+" ";
		}
		System.out.println(w.trim());
	}
	
	public void charOccuranceNoLoop(String s, CharSequence c)
	{
	  int lenBefore=s.length();
	  
	  s=s.replace(c,"");
	  
	  int lenAfter=s.length();
	  
	  System.out.println("The character "+c+" occurs "+(lenBefore-lenAfter)+" times");
	}
	
	
	public void stringPalindrome(String s)
	{
		int strlen=s.length();
		
		String revstr="";
		
		for(int i=strlen-1; i>=0; i--)
		{
			revstr=revstr+s.charAt(i);
		}
				
		if(s.equalsIgnoreCase(revstr))
		
		  System.out.println("The given string is Palindrome");
		
		else
			
		  System.out.println("The given string is not Palindrome");
		
	}
	
	public void numberOfWords(String s)
	{
		//remove the leading/trailing spaces
		s=s.trim();
		
		int count=0;
		for(int i=0; i<s.length(); i++)
		{
			
			if((i>0 && s.charAt(i)!=' ' && s.charAt(i-1)==' ') || (s.charAt(i)!=' ' && i==s.length()-1))
			{
				count=count+1;
			}
			
		}
	
	  System.out.println("The number of words are "+count);
	}
	
	public void reverseWords(String s)
	{
		String[] words=s.split(" ");
		String revString="";
				
		for(int i=0; i<words.length; i++)
		{
			String revWord="";
			for(int j=words[i].length()-1; j>=0; j--)
			{
				revWord=revWord+words[i].charAt(j);
			}
			revString=revString+revWord+" ";
		}
		System.out.println(revString.trim());
	}
	
	public void uc(String s)
	{
		int[] len=new int[123];
		String str="";
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			len[ch]=1;
		}
		
		for(int i=0; i<123; i++)
		{
			if(len[i]==1)
			{
				str=str+(char)i+" ";
			}
		}
	   
		System.out.println("The unique characters are "+str.trim());
	}
	
	public void rc(String s)
	{
		int[] len= new int [123];
		String str="";
		char ch;
		for(int i=0; i<s.length(); i++)
		{
			ch=s.charAt(i);
			len[ch]+=1;
		}
				
		for (int i=0; i<123; i++)
		{
			if(len[i]>1)
			{
			 str=str+(char)i+" ";	
			}
		}
	    
		System.out.println("The repeating characters are "+str.trim());
	}
	
	public static void main(String[] args) 
	{
		StringPrograms sp=new StringPrograms();
		//sp.nrepatingchar("anilail", 2);
		//sp.uniqueCharacter("anilani");
		//sp.numberOfTimesCharaterIsRepeating("anilnilnilniilll");
		//sp.reverseWordsInString("This is my Program");
		
		//sp.charOccuranceNoLoop("anilnilnilniilll", "n");
		//sp.stringPalindrome("anina");
		
		//sp.numberOfWords("   manchester united is also known as red devil ");
		
		//sp.reverseWords("This is my Program");
		
		sp.uc("anilnilnilniilll");
		sp.rc("anilnilnilniilll");
 	}

}
