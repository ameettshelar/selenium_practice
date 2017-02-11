package Reflections;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.sql.SQLException;

@SuppressWarnings("serial")
public abstract class Employee implements Serializable, Cloneable  
{
    
	//Fields
	public static int eno=111;
	static String ename="Durga";
	static String eaddr="Hyd";
	
	//Constructors
	public Employee(int eno, String ename, String eaddr)throws ClassCastException, ArithmeticException
	{
		
	}
	
	public Employee(int eno, String ename)throws RemoteException, SQLException
	{
		
	}
	
	public Employee(int i)throws InterruptedException
	{
		
	}

    //Methods
	public void add(int eno, String ename, String eaddr)throws ClassNotFoundException, ClassCastException
	{
		
	}

	public String search(int eno)throws ArithmeticException, InterruptedException
	{
		return "Success";
	}
	
	public String delete(int eno)throws SQLException
	{
		return null;
	}
}
