
public class Super_demo {

	Super_demo()

	{
		
		System.out.println("This is first consructor");
	}
}
class duper_demo extends Super_demo
{

	duper_demo(int x)

	{
		//super();// invoke super class constructor using super keyword
		System.out.println("This is second consructor");
	}
	
}

class superdemo1

{
	public static void main(String[] args)
	
	{
		duper_demo d1 = new duper_demo(299);
	}
}



