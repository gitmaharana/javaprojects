
abstract class Abstract_method {  // Abstract class

	abstract void display(); // Abstract method
}
class Newmethod extends Abstract_method{// create a subclass

	void display()//override the superclass abstract method

	{
		System.out.println("Method body is written over here for abstract class");
	}

	public static void main(String[] args) {

		Abstract_method am = new Newmethod();//Create object for abstract class - type cast the object

		am.display();

	}

}
