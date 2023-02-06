
public class heri1 
{
	void show1()
	{
		System.out.println("This is first method");
	}

}

class heri2 extends heri1 // Inherited from parent class

{
	void show2()
	{
		System.out.println("This is second method");	
	}
	public static void main(String[] args) 
	
	{
		heri2 h1 = new heri2();
		h1.show1(); // Child class object can call parent class variable
		h1.show2();
	}
		

}
