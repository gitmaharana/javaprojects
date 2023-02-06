
public class thiskeyword3_demo {
	// invoke current class constructor
	//calling default constructor from parameterized constructors

	thiskeyword3_demo()// constructor should not have any void return type

	{
		System.out.println("This is default constructor");
	}

	thiskeyword3_demo(int x)
	{
		this();// This should be first statement
		System.out.println("This is parameterized constructor");
	}
	public static void main(String[] args) {
		
		System.out.println("Output without this keyword");
		thiskeyword3_demo td1 = new thiskeyword3_demo();
		
		System.out.println("********************************************************************");
		
		System.out.println("Output with this keyword");
		thiskeyword3_demo td = new thiskeyword3_demo(200);
	}

}
