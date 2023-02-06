
public class static_var {
	
	static String school = "ABC School"; // static variable declared
	String name = "rocky";// non static variable declared
	static int age = 45; // static variable declared


	public static void main(String[] args) 
	{
		static_var s1 = new static_var();
		System.out.println("My school name is :" +school);
		//static variable can be directly called// object to be created for  call a non-static variable from static method
		System.out.println("My name is :" +s1.name); 
		//static variable can be directly called or u also can use class as well
		System.out.println("My age is :" + static_var.age);
		System.out.println("My age is :" +age);
	}

} 