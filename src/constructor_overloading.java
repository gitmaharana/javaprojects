
public class constructor_overloading {

	String name;
	int age;
	long mobile;

	public constructor_overloading(String name,int age)// Parameterized constructor
	{
		System.out.println("My name is :"+ name +" " +"My age is :" +age);
	}
	public constructor_overloading(String name,int age,long mobile)//constructor overloading
	{
		System.out.println("My name is :"+ name +" " +"My age is :" + age + " " + "Mobile no:" + mobile);
	}
	public constructor_overloading(int age,long mobile,String name)//constructor overloading
	{
		System.out.println("My age is :" +age + "Mobile no:" + mobile + "  " + "My name is :"+ name);
	}
	public static void main(String[] args) {

		// called constructor using constructor overloading process
		constructor_overloading p1 = new constructor_overloading ("Ram",18,8013743541l);
		constructor_overloading p2 = new constructor_overloading ("Ram",18);
		constructor_overloading p3 = new constructor_overloading (88,80139883541l,"Lucky");


	}

}
