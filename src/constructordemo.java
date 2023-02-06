 
public class constructordemo {
	
	String name ="Jhon";
	
	public constructordemo()//its a default constructor
	{
		System.out.println("My name is :" +name);
	}
	
	public static void main(String[] args) {

		constructordemo c1 = new constructordemo (); // called constructor
		constructordemo c2 = new constructordemo (); // called constructor
		constructordemo c3 = new constructordemo (); // called constructor

	}

}
