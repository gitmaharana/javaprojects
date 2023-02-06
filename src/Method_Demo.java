
public class Method_Demo {

	static String name = "ABC School"; // Variable declared
			String empl;
	         int age;

	public void display() // Method displayed
	
	{
		empl= "John"; // value initiated for variables
		age = 28;
		System.out.println("My school name is :" +name);
		System.out.println("My school name is :" +empl);
		System.out.println("My school name is :" +age);
	
	}
	                     
	public static void main(String[] args) {
		
		Method_Demo m1 = new Method_Demo();
		
		m1.display();// method called
		

	}

}
