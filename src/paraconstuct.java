
public class paraconstuct {

	String name;
	int age;

	public paraconstuct(String name,int age)// Parameterized constructor

	{
	System.out.println("My name is :"+ name +" " +"My age is :" +age);
	}

	public static void main(String[] args) {

		paraconstuct p1 = new paraconstuct ("Ram",18);
		paraconstuct p2 = new paraconstuct ("Hari",30);
		paraconstuct p3 = new paraconstuct ("Gopu",40);


	}

}
