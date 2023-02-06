
public class superdemo_animal {

	//Super keyword can be used to invoke parent class method
	// it should be used only if the subclass has same method or method overridden process perform by subclass

	public void eat()

	{
		System.out.println("Animal is eating now");// parent class method

	}

}

class superdemo_dog extends superdemo_animal{

	public void eat()

	{
		System.out.println("Dog is eating meat");// child class first method

	}

	public void bark()

	{
		System.out.println("Dog is eating now");// child class second method

	}

	public void display()

	{
		super.eat();// invoking superclass eat method
		//eat();//without super keyword subclass eat method will be printed
		bark();
	}

	public static void main(String[] args) {
		
		superdemo_dog sd = new superdemo_dog();
		sd.display();


	}

}
