
public class Constuctor_Overriding // Constructor overriding example
{
	public Constuctor_Overriding()
	{
		System.out.println("This is constuctor A");
	}

}
 class Constuctor_Overriding1 extends Constuctor_Overriding

{
	public Constuctor_Overriding1()
	{
		System.out.println("This is constuctor B");
	}
	public static void main(String[] args) {

		Constuctor_Overriding1 over = new Constuctor_Overriding1(); 

	}

}
