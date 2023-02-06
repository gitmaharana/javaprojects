
public interface Demo_interface {
// Generalization and specialization in Java Interface
	void eat();
	void makeSound();
}
class Dog implements Demo_interface 
{
	@Override
	public void eat(){
		System.out.println("Dog eats bone");
	}
	@Override
	public void makeSound(){
		System.out.println("Dog sounds ghao ghao");	
	}

}
class Cat implements Demo_interface {

	@Override
	public void eat() {
		System.out.println("Cat eats fish");	
	}

	@Override
	public void makeSound() {
		System.out.println("Cat sounds mweo mweo");	
	}
	
}
class GenRspec{
	public static void main(String[] args){
		
		//The process of developing a method which can handles any type of object,
		//is called as general method and this process is known as generalisation.
		
		animalDetails(new Dog ());//generalisation method for class
		animalDetails(new Cat ()); //generalisation method for class
		
	
		//The process of developing a method which handles only one type of object
		//such methods are called as special methods and process is called as
		//specialisation.
		
		//Dog d = new Dog ();
		//Cat c = new Cat ();
	
	
		//d.eat();
		//d.makeSound();
		
		//c.eat();
		//c.makeSound();
		
 
}

	private static void animalDetails(Demo_interface a) {
		
		// this is kind of upcasting interface
		//Demo_interface d = new Dog();
		//Demo_interface c = new Cat();
		
		a.makeSound();
		a.eat();

	}
		
		
	}




