
public class Method_Overriding1 {// Class 1
	
	public void car()
	{
		System.out.println("Black car");
	}

	public void carname()
	{
		System.out.println("Audi");
	}
	
}

class Method_Overriding2 extends Method_Overriding1{// Overriding method
	
	public void car()
	{
		System.out.println("Yellow car");
	}

	public void carname()
	{
		System.out.println("Ferrari");
	}
	
}
class Method_Overriding3 extends Method_Overriding2{// Overriding method
	
	public void car()
	{
		System.out.println("Green car");
	}

	public void carname()
	{
		System.out.println("Alto");
	}
	public static void main(String[] args) {
		
		// same method wiht different implementation 
	
		Method_Overriding3 m3 = new Method_Overriding3();
		m3.carname();
		m3.car();
		
		//Method_Overriding2 m2 = new Method_Overriding2();
		//m2.carname();
		//m2.car();
		
		//Method_Overriding1 m1 = new Method_Overriding1();
		//m1.carname();
		//m1.car();

	}

}
