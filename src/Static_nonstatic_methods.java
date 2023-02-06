
public class Static_nonstatic_methods {
	
	static String brname="Audi";//static var
	int capacity=4;//non static var
	
	//non static meth
	public void details()
	{
	String color="Black";//local var
	long price=5500000l;//local var
	System.out.println("Car name : "+brname);//Static variables can be called directly from non static method
	System.out.println("Car capacity : "+capacity);//Non-Static variables can be called directly from Non-static method
	System.out.println("Color is : "+color);
	System.out.println("Starting Price : "+price);
	}

	//static method
	public static void features()
	{
	//classname referencevar=new classname();
	Static_nonstatic_methods c1=new Static_nonstatic_methods();
	c1.details();
	System.out.println(c1.capacity);//Non-Static variables can be called from static method using object
	System.out.println(brname);//Static variables can be called directly from static method
	}
	public static void main(String[] args) {
		
		features();

	}

}
