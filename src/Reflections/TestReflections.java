package Reflections;
import java.lang.reflect.*;



public class TestReflections
{

	public void classDetails() throws ClassNotFoundException
	{
		//get class object
		Class c=Class.forName("Reflections.Employee");
		
		//get class name
		System.out.println("Name : "+c.getName());
		
		//get superclass name
		System.out.println("SuperClassName : "+c.getSuperclass());
		
		//get implemented interfaces
		Class[] ifc = c.getInterfaces();
		System.out.print("Implemented Interfaces : ");
		for(Class ic : ifc)
		{
			System.out.print(ic.getName()+" ; ");
		}
		System.out.println();
		//get access modifiers
		int i = c.getModifiers();
		System.out.println(Modifier.toString(i));
	}
	

	public void fieldDetails() throws Exception
	{
		//get class object
		Class<Employee> c=Employee.class;
		
		//get all fields
		Field[] flds=c.getDeclaredFields();
		for(Field f : flds)
		{
			//get Fields name
			System.out.println("Name : "+f.getName());
			
			//get data type
			System.out.println("Data Type : "+f.getType().getName());
			
			//get access modifiers
			int i=f.getModifiers();
			System.out.println("Access Modifers : "+Modifier.toString(i));
			
			//Get Field value
			System.out.println("Field value : "+f.get(f));
			
			System.out.println("-------------------------------------");
		}
	}
	
	
	public void methodDetails() throws Exception
	{
	    //get class object
		Class c=Class.forName("Reflections.Employee");
		
		//get all Methods
		Method[] mthd=c.getDeclaredMethods();
		
		for(Method m : mthd)
		{
			//get method name
			System.out.println("Name : "+m.getName());
			
			//get return type
			System.out.println("Return Type : "+m.getReturnType().getName());
			
			//get access modifiers
			int i=m.getModifiers();
			System.out.println("Access modifiers : "+Modifier.toString(i));
			
			//get parameter types
			Class[] pt=m.getParameterTypes();
			System.out.print("Parameter Types are : ");
			for(Class p : pt)
			{
				System.out.print(p.getName()+", ");
			}
			System.out.println();
			
			//get Exception types
			Class[] et=m.getExceptionTypes();
			System.out.print("Exception Types are : ");
			for(Class e : et)
			{
				System.out.print(e.getName()+", ");
			}
			System.out.println();
			
			
			System.out.println("-------------------------------------");
		}
		
	}
	
	public void constructorDetails()
	{
		//get class object
		Class<Employee> c=Employee.class;
		
		//get constructors
		Constructor[] cnsts = c.getDeclaredConstructors();
		for(Constructor con : cnsts)
		{
			//get Name
			System.out.println("Name : "+con.getName());
			
			//get access modifiers
			int i=con.getModifiers();
			System.out.println("Access modifiers : "+Modifier.toString(i));

			//get parameter types
			Class[] pt=con.getParameterTypes();
			System.out.print("Parameter Types are : ");
			for(Class p : pt)
			{
				System.out.print(p.getName()+", ");
			}
			System.out.println();
			
			//get Exception types
			Class[] et=con.getExceptionTypes();
			System.out.print("Exception Types are : ");
			for(Class e : et)
			{
				System.out.print(e.getName()+", ");
			}
			System.out.println();

			System.out.println("-------------------------------------");	
		}
		
	}
	public static void main(String[] args) throws Exception 
	{
		
		TestReflections t=new TestReflections();
		t.classDetails();
		System.out.println("*************************************************");		
		t.fieldDetails();
		System.out.println("*************************************************");
		t.methodDetails();
		System.out.println("*************************************************");
		t.constructorDetails();
				
		
	}

}

