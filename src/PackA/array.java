package PackA;

public class array 
{
	double[] arr1={1.2, 1.3, 2.5, 2.6, 3.8, 3.9};
	
	public void arrayprint()
	{
		
		for (int cnt=0; cnt<arr1.length; cnt++)
		{
			System.out.println(arr1[cnt]);
			
		}
	}
	
	public void arraysum()
	{
		double sum=0;
		for (int cnt=0; cnt<arr1.length; cnt++)
		{
			sum=sum+arr1[cnt];
		}
		System.out.println(sum);	
	}
	
	public void arraymax()
	{
		
		double max=arr1[0];
		
		for(int cnt=1; cnt<arr1.length; cnt++)
		{
			if(max<arr1[cnt])
			{
				max=arr1[cnt];
			}	
		}
		System.out.println("The maximum element of array is "+max);	
	}
	
	
	public static void main(String[] args)
	{
	  array obj = new array();
	  obj.arrayprint();
	  obj.arraysum();
	  obj.arraymax();

	}

}
