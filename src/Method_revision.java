
public class Method_revision {
	
	static String  school = "KBDAV School";
	String name = "Rajeeb";
	int age = 20;
	char gender = 'M';
	
	
	// non static method
	public void emp_details()
	
	{
		System.out.println("My school name is :"  + school);
		System.out.println("My name is :"  + name);
		System.out.println("My age is :"  + age);
		System.out.println("My gender is :"  + gender);
		
	}
	
	//static method
	public static void emp_features()
	{
		String name = "Raveena";
		int age = 10;
		char gender = 'f';
		System.out.println("My school name is :"  + school);
		System.out.println("My name is :"  + name);
		System.out.println("My age is :"  + age);
		System.out.println("My gender is :"  + gender);
		
	}

	public static void main(String[] args) {
		
		Method_revision m1 = new Method_revision();
		
		emp_features();
		m1.emp_details();// non static methods can't be called from static method
		
		
		
		
		

	}

}
