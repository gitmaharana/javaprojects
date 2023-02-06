
public class method_overriding_demo{
	
	public void school()

	{
		System.out.println("This is my school");
	}
	
}

class newdemo extends method_overriding_demo{

public void school()

	{
	
		System.out.println("This is your school");
	}


	public static void main(String[] args) {

		newdemo md = new newdemo();

		md.school();

	}

}