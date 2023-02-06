
public class Final_Demo1 {
	
	String name = "Shakira";
	int roll = 44;

	public void displayName()
	{
		System.out.println("guest name is" + name);	
	}
	
	public static void main(String[] args) {

		

	} 
}



/*String name = "Shakira";
int roll = 44;

final public void displayName()
{
	System.out.println("guest name is" + name);	
}

final public void displayName(int roll)// method can be overloaded with final
{
	System.out.println(" Roll number is" + roll);	
}

Final_Demo1 fd = new Final_Demo1();

fd.displayName(33);*/


/*public class Final_Demo1 {
	
	final String name = "Shakira";// Final variables
	int roll = 44;
	

	public static void main(String[] args) {

		Final_Demo1 fd = new Final_Demo1();
		fd.roll = 88;// non final variable can be reinitialized
		
		System.out.println("guest name is" + fd.name + "roll no. is" + fd.roll);*/
		