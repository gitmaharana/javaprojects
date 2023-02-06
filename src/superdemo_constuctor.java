
public class superdemo_constuctor {

	superdemo_constuctor()

	{
		System.out.println("This is  first default constructor");// parent class constructor

	}

}

class subdemo_constuctor extends superdemo_constuctor{

	subdemo_constuctor(int x)

	{
		super();
		System.out.println("This is parameterized constructor with integer");// child class first constructor

	}

	subdemo_constuctor(char a)
 
	{
		super();// You can invoke parent constructor with super parameter
		System.out.println("This is second parameterized constructor with char");// child class second constructor

	}

	public static void main(String[] args) {
		
		subdemo_constuctor sc = new subdemo_constuctor('a');

	}

}
