
public class jvpoint_copyconstructor2 {
	
	// copy constructor without using object constructor
	
	String name;
	int roll;
	
	jvpoint_copyconstructor2 (String name,int roll)// parameterized constructor
	{
		this.name = name;
		this.roll = roll;
	}
	
	jvpoint_copyconstructor2(){}// create a default constructor
	void display()
	{
		System.out.println("My name & roll details are" + " " + name + " and " + roll);
	}

	public static void main(String[] args) {
	
		jvpoint_copyconstructor2 jc = new jvpoint_copyconstructor2("Sam",44);
		jvpoint_copyconstructor2 jc1 = new jvpoint_copyconstructor2();

			jc1.name = jc.name;// copied name value from parameterized constructor
			jc1.roll = jc.roll;// copied roll value from parameterized constructor
			
			jc.display();
			jc1.display();
	}

}
