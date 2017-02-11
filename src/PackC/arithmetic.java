package PackC;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class arithmetic 
{
    //int x=10;
    //int y=20;
    
    public  int sum(int x, int y)
    {
		int c=x+y;
    	return c;
    	//System.out.println(x+y);
    	
    	
    }
    
    //it will check if given number is Prime
    public void CheckPrimeNumber(int num)
    {
    	int counter=0;
    	int prime;
    	for(int i=1; i<=num; i++)
    	{
    		prime=num % i;
    		if(prime==0)
    		{
    			counter=counter+1;
    		}
    	}
    	
    	if(counter==2)
    	{
    		System.out.println(num+" is Prime");
    	}
    	else
    	{
    		System.out.println(num+" is not Prime");
    	}
    	
    }
    
    public void First_n_PrimeNumbers(int n)
    {
    	int ncnt=0;//counter for counting prime numbers
    	int prime=0;
    	int stnum=2;//starting number
    	String s="";
    	while(ncnt<n)
    	{
    		int counter=0;
    		for(int snum=1; snum<=stnum; snum++)
        	{
        		prime = stnum % snum;
        		if(prime==0)
        		{
        			counter=counter+1;
        		}
        	}
        	if(counter==2)
        	{
        		s=s+stnum+" ";
        		ncnt=ncnt+1;
        	}
        	stnum=stnum+1;	
    	}
    	System.out.println("The first "+n+" Prime numbers are "+s);
    }
    
    public void PrimeNumbersTill_n(int n)
    {
    	int ncnt=0;//counter for counting prime numbers
    	int prime=0;
    	String s="";
    	for(ncnt=2; ncnt<=n; ncnt++)
    	{
    		int counter=0;
    		for(int snum=1; snum<=ncnt; snum++)
        	{
        		prime = ncnt % snum;
        		if(prime==0)
        		{
        			counter=counter+1;
        		}
        	}
        	if(counter==2)
        	{
        		s=s+ncnt+" ";
        	}
    	}
    	System.out.println("The first "+n+" Prime numbers are "+s);
    }
    
    public void DecimalToBinary(int num)
    {
    	int rem=0;
    	String s="";
    	while(num>0)
    	{
    		rem=num % 2;
    		num=num / 2;
    		s=rem+s;
    	}
    	System.out.println(s);
    }
    
	public void BinaryToDecimal(int num)
	{
		String snum=Integer.toString(num);
		int bin=1;
		int dec=0;
		for(int cnt=snum.length()-1; cnt>=0; cnt--)
		{
			char ch=snum.charAt(cnt);//Get the last character
			String sch=Character.toString(ch);//Convert to string
			int ich=Integer.parseInt(sch);//Convert to integer
			dec=dec+(ich*bin);
			bin=bin*2;
			
		}
		System.out.println(dec);
	}

	@SuppressWarnings("resource")
	public void palindromeNumber()
	{
	    Scanner scn=new Scanner(System.in);
	    System.out.println("Please enter the number");
		
	    int num=scn.nextInt();
	    int res=0;
	    int sum=0;
	    int temp=num;
	    while(num>0)
	    {
	    	res=num % 10;
	    	sum=(sum*10)+res;
	    	num=num / 10;
	    }
	   
	    if(sum==temp)
	      	System.out.println("The number is Palindrome");
	    else
	    	System.out.println("The number is not Palindrome");
 	   
	}
    
	
	public void numberOccurance() throws FileNotFoundException
	{
		Scanner scn= new Scanner(new File("E:\\interview\\filereader.txt"));
		
		ArrayList<Integer> al= new ArrayList<>();
		
		while(scn.hasNext())
		{
			al.add(scn.nextInt());
		}
		
	
		int[] arrtemp=new int[al.size()];
		for(int i=0; i<arrtemp.length; i++)
		{
			arrtemp[i]=-1;
		}
		
		for(int i=0; i<al.size(); i++)
		{
			int count=1;
			for(int j=i+1; j<al.size(); j++)
			{
				if(al.get(i)==al.get(j))
				{
					count++;
					arrtemp[j]=0;
				}
			}
			
			if(arrtemp[i]!=0)
			{
				arrtemp[i]=count;
			}
		}
			
		for(int i=0; i<arrtemp.length; i++)
		{
			if(arrtemp[i]!=0)
			{
				System.out.println(al.get(i)+" occurs "+arrtemp[i]+" times");
			}
		}
		
		scn.close();
	}
	
   
	public void sortArray()
	{
		int [] a={1,3,6,2,9,8};
		int temp;
		
		for (int i = 0; i < a.length; i++) 
        {
            for (int j = i + 1; j < a.length; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < a.length; i++) 
        {
            System.out.print(a[i] + ",");
        }
	}
	
	public void facorial(int n)
	{
		int fact=1;
		for(int i=n; i>0; i--)
		{
			fact=fact*i;
		}
		
		System.out.println(fact);;
	}
	
    public int recrusiveFactorial(int n)
    {
    	if(n==0)
    	{
    		return 1;
    	}
    	else
    	{
    		int f=n*recrusiveFactorial(n-1);
    		return f;
    	}
    }
	
    public void numArmstrong(int num)
    {
    	
    	int temp=num;
    	int digits=0;
    	
    	//Count the number of digits
    	while(temp!=0)
    	{
    		temp=temp/10;
    		digits++;
    	}
    	
    	temp=num;
    	
    	int sum=0;
    	int r=0;
    	while(temp!=0)
    	{
    		r=temp%10;
    		sum=sum+power(r, digits);
    		temp=temp/10;
    	}
    	
    	if(sum==num)
    		System.out.println("Given number is Armstrong number");
    	else
    		System.out.println("Given number is not Armstrong number");
    }
    
    public static int power(int n, int r)
    {
    	int p=1;
    	for(int i=1; i<=r; i++)
    	{
    		p=p*n;
    	}
		return p;
    }
	public static void main(String[] args) throws FileNotFoundException 
	{
		arithmetic a=new arithmetic();
		//a.CheckPrimeNumber(15);
		//a.First_n_PrimeNumbers(10);
		//a.PrimeNumbersTill_n(25);
		//a.DecimalToBinary(8);
		//a.BinaryToDecimal(1000);
		//a.palindromeNumber();
		//a.numberOccurance();
		//a.sortArray();
		//a.facorial(5);
	   //System.out.println(a.recrusiveFactorial(5));
		a.numArmstrong(153);
	}

}
